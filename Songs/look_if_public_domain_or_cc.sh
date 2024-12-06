#!/bin/bash

# Default download directory (can be overridden with an argument)
DEFAULT_DOWNLOAD_DIR="./songsdown"

# Function to check if a file is public domain or Creative Commons
check_public_domain_or_cc() {
    local file="$1"
    # Placeholder logic: Replace with actual metadata checks or API calls
    metadata=$(ffmpeg -i "$file" 2>&1 | grep -E "(title|comment)" | awk -F ": " '{print $2}')
    
    # Check for "public domain" or "Creative Commons" in metadata
    if echo "$metadata" | grep -qiE "public domain|creative commons"; then
        echo "File is public domain or Creative Commons: $file"
        return 0  # True
    else
        echo "File is NOT public domain or Creative Commons: $file"
        return 1  # False
    fi
}

# Function to download a public domain or CC version of the song
download_public_domain_or_cc_version() {
    local song_title="$1"
    local download_dir="$2"

    # Ensure the download directory exists
    mkdir -p "$download_dir"

    echo "Searching for a public domain or Creative Commons version of: $song_title"
    yt-dlp "ytsearch:${song_title} public domain creative commons" --extract-audio --audio-format mp3 -o "${download_dir}/%(title)s.%(ext)s"
}

# Function to convert a file to .mp3
convert_to_mp3() {
    local file="$1"
    local output_dir="$2"

    # Ensure the output directory exists
    mkdir -p "$output_dir"

    # Generate the output filename
    output_file="${output_dir}/$(basename "${file%.*}").mp3"
    echo "Converting $file to $output_file"

    # Convert to .mp3
    ffmpeg -i "$file" -q:a 0 "$output_file" -y
}

# Process a single file
process_file() {
    local file="$1"
    local download_dir="$2"

    echo "Processing file: $file"

    if check_public_domain_or_cc "$file"; then
        # File is public domain or Creative Commons
        if [[ "${file##*.}" != "mp3" ]]; then
            echo "Converting file to .mp3: $file"
            convert_to_mp3 "$file" "$download_dir"
            rm -f "$file"  # Delete original after conversion
        else
            echo "File is already an .mp3 and public domain/CC. No action needed."
        fi
    else
        # File is not public domain or Creative Commons
        # Extract the title for the download query
        song_title=$(ffmpeg -i "$file" 2>&1 | grep "title" | awk -F ": " '{print $2}')
        
        # If the title is empty, use the filename without extension
        if [ -z "$song_title" ]; then
            song_title=$(basename "$file" | sed 's/\.[^.]*$//')
        fi

        echo "Searching for a public domain or Creative Commons version of '$song_title'..."
        download_public_domain_or_cc_version "$song_title" "$download_dir"

        echo "Deleting original file: $file"
        rm -f "$file"
    fi
}

# Main script logic
if [ $# -lt 1 ]; then
    echo "Usage: $0 <path-to-files-or-directory> [download-directory]"
    exit 1
fi

input_path="$1"
download_dir="${2:-$DEFAULT_DOWNLOAD_DIR}"  # Use the provided directory or the default

# Check if the input is a directory or a single file
if [ -d "$input_path" ]; then
    echo "Processing all media files in directory: $input_path"
    find "$input_path" -type f \( -iname "*.mp3" -o -iname "*.webm" -o -iname "*.mp4" -o -iname "*.m4a" -o -iname "*.wav" \) | while read -r file; do
        process_file "$file" "$download_dir"
    done
elif [ -f "$input_path" ]; then
    process_file "$input_path" "$download_dir"
else
    echo "Error: Invalid input. Please provide a valid file or directory."
    exit 1
fi

