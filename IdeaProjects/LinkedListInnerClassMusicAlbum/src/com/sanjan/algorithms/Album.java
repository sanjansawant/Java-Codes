package com.sanjan.algorithms;

/**
 * Created by sanja on 1/12/2017.
 */
import java.util.*;
public class Album {

    private String name;
    private String artist;
    private SongList songlist;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songlist=new SongList();
    }

    public String getName() {
        return name;
    }

    public boolean addSongs(String name, double duration){
        return songlist.addSongs(name,duration);

    }

    public boolean addToPlayList(String songName,List<Song> playList){

        if(songlist.findSongs(songName)!=null){
            playList.add(songlist.findSongs(songName));
            return true;
        }return false;

    }

    public boolean addToPlayList(int trackNumber,List<Song> playList){
        int index=trackNumber-1;
        if(index<=songlist.getSongs().size()) {
            Song name = songlist.getSongs().get(index);
            playList.add(name);
            return  true;
        }return false;

    }


    private class SongList{

        ArrayList<Song> songs;

        public SongList() {
            this.songs=new ArrayList<>();
        }


        public ArrayList<Song> getSongs() {
            return songs;
        }


        public boolean addSongs(String name,double duration){

            Song name1=findSongs(name);
            if(name1==null){
                songs.add(new Song(name,duration));
                //System.out.println(songs.size());
                return true;
            }
            return false;
        }


        private Song findSongs(String name){

            for(int i=0;i<songs.size();i++){

                if(songs.get(i).getName().equalsIgnoreCase(name)){
                    return songs.get(i);
                }
            }return null;

        }
    }

}
