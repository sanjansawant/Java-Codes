package com.Sanjan;

/**
 * Created by sanja on 1/4/2017.
 */

import java.util.*;

public class Album {

    private String name;
    private ArrayList<Song> songs;

    public Album(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String name, double time) {

        if (find(name) == null) {

            songs.add(new Song(name, time));
            return true;

        } else {
            //System.out.println("song is already in the list");
            return false;
        }
    }

    private Song find(String name) {

        for (int i = 0; i < songs.size(); i++) {

            if (songs.get(i).getTitle().equalsIgnoreCase(name)) {

                return songs.get(i);
            }
        }
        return null;

    }

    public LinkedList<String> getSongs() {

        LinkedList<String> songs1 = new LinkedList<>();
        for (int i = 0; i < songs.size(); i++) {

            String temp = songs.get(i).getTitle();
            songs1.add(temp);
        }
        return songs1;

    }

    public boolean addToPlaylist(String song, LinkedList<Song> playList) {

        if (find(song) != null) {
            Song song1 = find(song);
            playList.add(song1);
            //System.out.println("song added");
            return true;
        } else {

            //System.out.println("song not present in the album");
            return false;
        }
    }

    public boolean addToPlayListViaTrack(int trackNumber, LinkedList<Song> playList) {

       /* Song name = songs.get(trackNumber - 1);
        return addToPlaylist(name.getTitle(), playList);*/


       int index=trackNumber-1;
       if(index>0 && index<=songs.size()){
           playList.add(this.songs.get(index));
           return true;
       }
        System.out.println("song not in the playlist "+trackNumber);
        return false;
    }


}
