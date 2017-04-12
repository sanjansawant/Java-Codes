package com.Sanjan;

/**
 * Created by sanja on 12/29/2016.
 */
public class Song {
    private String songName;
    private double length;
    private String artist;


    public Song(String songName, double length, String artist) {
        this.songName = songName;
        this.length = length;
        this.artist = artist;
    }


    public String getSongName() {
        return songName;
    }

    public double getLength() {
        return length;
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public String toString() {
        return "Song{" +
                "songName='" + songName + '\'' +
                ", length=" + length +
                ", artist='" + artist + '\'' +
                '}';
    }
}
