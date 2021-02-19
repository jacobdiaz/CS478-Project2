package com.jdiaz88.project_2;

public class Song {
    private String songTitle;
    private String artistName;
    private String albumCoverPath;
    private String songUrl;


    public Song(String songTitle, String artistName, String albumCoverPath,String songUrl){
        this.songTitle = songTitle;
        this.artistName = artistName;
        this.albumCoverPath = albumCoverPath;
        this.songUrl = songUrl;
    }

    public String getAlbumCoverPath() {
        return albumCoverPath;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public String getSongUrl() {
        return songUrl;
    }

    public void setAlbumCoverPath(String albumCoverPath) {
        this.albumCoverPath = albumCoverPath;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }

    public void setSongUrl(String songUrl) {
        this.songUrl = songUrl;
    }
}
