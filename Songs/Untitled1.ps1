# PowerShell Script to download songs as .mp3 files using yt-dlp

# Path to the text file containing the list of song names
$songListPath = "C:\Users\**\Documents\Songs\Songlist.txt"

# Directory where the MP3 files will be saved
$outputDirectory = "C:\Users\**\Documents\Songs\downloads"

# Path to yt-dlp (if it's not in your system's PATH)
$ytDlpPath = "C:\Users\**\AppData\Local\Programs\Python\Python312\Scripts\yt-dlp.exe"

# Read the song names from the file
$songNames = Get-Content -Path $songListPath

# Ensure output directory exists
if (-not (Test-Path $outputDirectory)) {
    New-Item -ItemType Directory -Path $outputDirectory
}

# Loop through each song and download it as an mp3
foreach ($song in $songNames) {
    Write-Host "Searching and downloading: $song"

    # Build the yt-dlp command to download only the audio as mp3
    $ytDlpCommand = "$ytDlpPath --extract-audio --audio-format mp3 --output ""$outputDirectory\%(title)s.%(ext)s"" ""ytsearch1:$song"""

    # Execute the command
    Invoke-Expression $ytDlpCommand
}