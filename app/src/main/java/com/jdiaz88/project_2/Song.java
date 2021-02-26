package com.jdiaz88.project_2;

public class Song {
    private String songTitle;
    private String artistName;
    private String youTubeURL;
    private String wikiUrl;



    public Song(String songTitle, String artistName,String youTubeURL, String wikiUrl){
        this.songTitle = songTitle;
        this.artistName = artistName;
        this.youTubeURL = youTubeURL;
        this.wikiUrl = wikiUrl;
    }


    public String getArtistName() {
        return artistName;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public String getYouTubeURL() {
        return youTubeURL;
    }
    public String getWikiUrl() {
        return wikiUrl;
    }
}
