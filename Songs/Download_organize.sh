#!/bin/bash

# Path to the text file containing the list of song names
SONG_LIST_PATH="Songlist.txt"

# Directory where the MP3 files are saved
OUTPUT_DIRECTORY="/home/gabriel/Dokument/GitHub/Mini_Kingdoms/Songs/songsdown"

# Path to yt-dlp (if it's not in your system's PATH)
YT_DLP_PATH="/usr/local/bin/yt-dlp"

# Ensure the output directory exists
if [ ! -d "$OUTPUT_DIRECTORY" ]; then
    mkdir -p "$OUTPUT_DIRECTORY"
fi

# Function to get metadata field dynamically
get_metadata_field() {
    local file="$1"
    local field="$2"

    # Extract the specified metadata field using ffprobe
    ffprobe -v quiet -show_entries format_tags="$field" -of default=noprint_wrappers=1:nokey=1 "$file" 2>/dev/null
}

# Function to display an overall loading bar
show_progress() {
    local current=$1
    local total=$2
    local width=50  # Width of the progress bar

    # Calculate the progress percentage
    local progress=$((current * 100 / total))
    local completed=$((current * width / total))
    local remaining=$((width - completed))

    # Calculate the RGB color (red to green transition)
    local red=$((255 - (progress * 255 / 100)))
    local green=$((progress * 255 / 100))
    local color="\\e[38;2;${red};${green};0m"

    # Draw the progress bar
    printf "\\r${color}["
    printf "%0.s#" $(seq 1 $completed)
    printf "%0.s-" $(seq 1 $remaining)
    printf "] %d/%d (%d%%)\\e[0m" "$current" "$total" "$progress"
}

# Step 1: Calculate Total Tasks
total_tasks=0

# Count the total number of songs in the list
if [ -f "$SONG_LIST_PATH" ]; then
    total_tasks=$((total_tasks + $(wc -l < "$SONG_LIST_PATH")))
fi

# Count all existing MP3 files for organization
existing_songs=("$OUTPUT_DIRECTORY"/*.mp3)
total_tasks=$((total_tasks + ${#existing_songs[@]}))

# If no tasks found, exit
if [ "$total_tasks" -eq 0 ]; then
    echo "No tasks to perform. Exiting."
    exit 0
fi

# Initialize progress tracker
completed_tasks=0

# Step 2: Download missing songs
if [ -f "$SONG_LIST_PATH" ]; then
    while IFS= read -r song; do
        # Check if the song already exists in the output directory
        existing_file=$(find "$OUTPUT_DIRECTORY" -type f -iname "*$song*.mp3" -print -quit)

        if [[ -n "$existing_file" ]]; then
            echo "Song already exists: $existing_file. Skipping download."
        else
            # Download the song using yt-dlp and convert it to mp3
            echo "Downloading: $song"
            
            # Search for the song on YouTube and download the best audio format, converting to mp3
            search_query=$(echo "$song" | sed 's/ /+/g')
            search_url="ytsearch1:$search_query"
            $YT_DLP_PATH -o "$OUTPUT_DIRECTORY/%(title)s.%(ext)s" -f bestaudio --extract-audio --audio-quality 0 --audio-format mp3 "$search_url"
        fi

        # Update progress bar
        completed_tasks=$((completed_tasks + 1))
        show_progress "$completed_tasks" "$total_tasks"
    done < "$SONG_LIST_PATH"
fi

# Step 3: Organize all existing songs
echo -e "\\nOrganizing songs by artist..."

for file in "$OUTPUT_DIRECTORY"/*.mp3; do
    # Skip if not a valid file
    [[ -f "$file" ]] || continue

    # Get the artist from the song's metadata
    artist=$(get_metadata_field "$file" "artist")

    # Use a default folder if no artist is found
    if [[ -z "$artist" ]]; then
        artist="Unknown Artist"
    fi

    # Create a folder for the artist if it doesn't exist
    mkdir -p "$OUTPUT_DIRECTORY/$artist"

    # Move the song to the artist folder
    mv "$file" "$OUTPUT_DIRECTORY/$artist/"

    # Update progress bar
    completed_tasks=$((completed_tasks + 1))
    show_progress "$completed_tasks" "$total_tasks"
done

# Finalize
echo -e "\\n\\nAll tasks completed successfully."

