package com.jdiaz88.project_2;

public class Song {
    private String songTitle;
    private String artistName;
    private String songUrl;


    public Song(String songTitle, String artistName,String songUrl){
        this.songTitle = songTitle;
        this.artistName = artistName;
        this.songUrl = songUrl;
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

}
