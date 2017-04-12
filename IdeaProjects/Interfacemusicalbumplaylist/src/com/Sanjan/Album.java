package com.Sanjan;

/**
 * Created by sanja on 1/4/2017.
 */

import java.util.*;

public class Album {

    private String name;
    private SongList songsList;


    public Album(String name) {
        this.name = name;
        this.songsList = new SongList();

    }

    public boolean addSong(String name, double time) {

        if (find(name) == null) {
            songsList.addSong(name, time);
            return true;

        } else {
            //System.out.println("song is already in the list");
            return false;
        }
    }

    private Song find(String name) {

        for (int i = 0; i < songsList.getSongs().size(); i++) {

            if (songsList.getSongs().get(i).getTitle().equalsIgnoreCase(name)) {

                return songsList.getSongs().get(i);
            }
        }
        return null;

    }


    public boolean addToPlaylist(String song, List<Song> playList) {

        if (find(song) != null) {
            Song song1 = find(song);
            playList.add(song1);

            return true;
        } else {
            return false;
        }
    }

    public boolean addToPlayListViaTrack(int trackNumber, List<Song> playList) {


        int index = trackNumber - 1;
        if (index > 0 && index <= songsList.songs.size()) {
            playList.add(songsList.songs.get(index));
            return true;
        }
        System.out.println("song ot in the playlist " + trackNumber);
        return false;
    }

    private class SongList {

        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<>();
        }

        public void addSong(String title, double duration) {
            songs.add(new Song(title, duration));
        }

        public ArrayList<Song> getSongs() {
            return songs;
        }


    }


}
