#!/bin/bash

# The list of songs
SONG_LIST="Songlist.txt"
# Output text file for license information
LICENSE_FILE="song_licenses.txt"
# Base folder for song downloads
BASE_FOLDER="songsdown"

# Create or clear the license file
> "$LICENSE_FILE"

# Create the base folder if it doesn't exist
mkdir -p "$BASE_FOLDER"

# Function to display an enhanced progress bar
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

# Initialize language variable
current_lang=""

# Read the song list and process each song
total_songs=$(wc -l < "$SONG_LIST")
current_song=0

# Loop through each song in the list
while IFS= read -r line
do
  # Skip empty lines or comment lines
  if [[ -z "$line" || "$line" =~ ^# ]]; then
    continue
  fi
  
  # If the line ends with a colon, it's a language header
  if [[ "$line" =~ :$ ]]; then
    # Extract the language name (e.g., 'Svenska', 'English')
    current_lang=$(echo "$line" | cut -d: -f1)
    # Create the folder for the language under the base folder
    mkdir -p "$BASE_FOLDER/$current_lang"
    continue  # Skip to the next line (song)
  fi

  # Now process the song line under the current language
  song_name="$line"

  # Increment current song counter
  ((current_song++))

  # Download the song using yt-dlp
  yt-dlp "ytsearch1:$song_name" -x --audio-format mp3 -o "$BASE_FOLDER/$current_lang/%(title)s.%(ext)s"


  # Convert the downloaded file (if needed)
  for file in "$BASE_FOLDER/$current_lang"/*.webm; do
    if [[ -f "$file" ]]; then
      ffmpeg -i "$file" -q:a 0 -map a "$file.mp3" && rm "$file"
    fi
  done

  # Get the Creative Commons license using the MetaBrainz API
  response=$(curl -s "https://musicbrainz.org/ws/2/recording/?query=$song_name&limit=1&fmt=json&token=$META_BRAINZ_API_TOKEN")
  license=$(echo "$response" | jq -r '.recordings[0].licenses[0].license')

  # If no license found, mark as public domain
  if [[ "$license" == "null" ]]; then
    license="Public Domain"
  fi

  # Log the song and its license to the text file
  echo "$song_name - $license" >> "$LICENSE_FILE"

  # Update progress bar
  show_progress "$current_song" "$total_songs"

done < "$SONG_LIST"

# Finish progress bar
echo -e "\nDownload and conversion completed!"

