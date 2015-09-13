package com.rabor.musicplayerdemo;

// Class that will contain the track information
public class Song {

    // instance variables
    private long id;
    private String title;
    private String artist;

    // constructor
    public Song(long songID, String songTitle, String songArtist) {
        id=songID;
        title=songTitle;
        artist=songArtist;
    }

    // the following methods are the getters
    public long getID(){
        return id;
    }

    public String getTitle(){
        return title;
    }

    public String getArtist(){
        return artist;
    }
}
