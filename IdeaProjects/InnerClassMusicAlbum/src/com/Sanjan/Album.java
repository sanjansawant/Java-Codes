package com.Sanjan;

import java.util.ArrayList;
import java.util.*;

/**
 * Created by sanja on 1/8/2017.
 */
public class Album {

    private String albumName;
    private SongList songlist;


    public Album(String albumName) {
        this.albumName = albumName;
        this.songlist = new SongList();
    }

    public String getAlbumName() {
        return albumName;
    }


    public boolean addSong(String songName, int duration){

        if(findSong(songName)){
            return false;

        }else{
            return (songlist.addSong(songName,duration));

        }
    }




    public boolean findSong(String name){

        ArrayList<Song> getter=songlist.getSongs();

        for(int i=0;i<getter.size();i++){
            if(getter.get(i).getTitle().equalsIgnoreCase(name)){
                return true;
            }
        }return false;
    }


    public void addToPlayList(String songName,List<Song> playList){

        Song name=findSongName(songName);


        for(int i=0;i<playList.size();i++) {

            if (playList.get(i).getTitle().equalsIgnoreCase(songName)) {

                System.out.println("song cannot be added");

            }
        }playList.add(name);


    }


    public void addToPlayList(int trackNumber,List<Song> playList){

        Song name=songlist.getSongs().get(trackNumber-1);
        addToPlayList(name.getTitle(),playList);

    }


    private Song findSongName(String name){

        for(int i=0;i<songlist.getSongs().size();i++){


            if(songlist.getSongs().get(i).getTitle().equalsIgnoreCase(name)) {
                return songlist.getSongs().get(i);
            }
        }return null;


    }



    private class SongList{

        private ArrayList<Song> songs;

        private SongList(){

            this.songs=new ArrayList<>();
        }

        public ArrayList<Song> getSongs(){

            return (this.songs);

        }

        public boolean addSong(String name, int time){

            songs.add(new Song(name,time));
            return true;
        }


    }

}
