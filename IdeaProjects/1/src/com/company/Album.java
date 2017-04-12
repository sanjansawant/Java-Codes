package com.company;

import java.util.LinkedList;

/**
 * Created by sanja on 3/25/2017.
 */
public class Album {

    private String name;
    private int totalSongs;
    private LinkedList<Song> songs;


    public Album(String name, int totalSongs) {
        this.name = name;
        this.totalSongs = totalSongs;
        this.songs=new LinkedList<>();
    }

    public void setSong(String songName,double duration){

        if(this.songs.size()<=totalSongs){

            songs.add(new Song(songName,duration));

        }
    }

    public LinkedList<Song> getSongs() {
        return songs;
    }

    private class Song{

        private String name;
        private double duration;

        public Song(String name, double duration) {
            this.name = name;
            this.duration = duration;
        }

        @Override
        public String toString() {
            return "Song{" +
                    "name='" + name + '\'' +
                    ", duration=" + duration +
                    '}';
        }


        public String getName() {
            return name;
        }

        public double getDuration() {
            return duration;
        }
    }


}
