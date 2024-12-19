#!/bin/bash

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

# Main script
convert_and_copy() {
    local src_dir=$1
    local dest_dir=$2

    # Create the destination directory if it doesn't exist
    mkdir -p "$dest_dir"

    # Get a list of all files and directories in the source folder
    mapfile -t files < <(find "$src_dir" -type f)
    local total_files=${#files[@]}
    local count=0

    # Process each file
    for src_file in "${files[@]}"; do
        # Calculate the destination path
        relative_path="${src_file#$src_dir/}"
        dest_file="$dest_dir/$relative_path"
        dest_dir_path=$(dirname "$dest_file")

        # Ensure the destination directory exists
        mkdir -p "$dest_dir_path"

        # If the file is an MP3, convert it to OGG
        if [[ "$src_file" == *.mp3 ]]; then
            ffmpeg -loglevel error -i "$src_file" "${dest_file%.mp3}.ogg"
        else
            # Copy other files as is
            cp "$src_file" "$dest_file"
        fi

        # Update the progress bar
        count=$((count + 1))
        show_progress "$count" "$total_files"
    done

    # Print a new line after completion
    echo
}

# Usage check
if [[ $# -ne 2 ]]; then
    echo "Usage: $0 <source_directory> <destination_directory>"
    exit 1
fi

# Run the conversion and copy process
convert_and_copy "$1" "$2"

