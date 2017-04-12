package com.Sanjan;

import java.util.LinkedList;

/**
 * Created by sanja on 12/29/2016.
 */
public class Album {

    private String albumName;
    private int totalSongs;
    private LinkedList<Song> newList = new LinkedList<>();

    public Album(String albumName, int totalSongs) {
        this.albumName = albumName;
        this.totalSongs = totalSongs;
    }

    public String getAlbumName() {
        return albumName;
    }


    public boolean addSong(String song,double length,String artist) {

        if (findSong(song) == null){
            Song newSong =new Song(song,length,artist);
            if(newList.size()<totalSongs){

                newList.add(newSong);
                System.out.println("new song added");
                return true;
            }else{
                System.out.println("The Album is full");
                return false;
            }

        }else{
            System.out.println("the song is already in the list");
            return false;
        }
    }

    public boolean removeSong(String song) {


        if (findSong(song) != null){
            Song songName=findSong(song);
            newList.remove(songName);
            System.out.println("song removed");
            return true;


        }else{
            System.out.println("the song is not in the list");
            return false;
        }
    }



    public Song findSong(String song) {

        for (int i = 0; i < newList.size(); i++) {

            if (newList.get(i).getSongName() == song) {

                return newList.get(i);
            }
        }
        return null;

    }


    public void displaySongs(){

        for(int i=0;i<newList.size();i++){


            System.out.println(newList.get(i).toString());
        }


    }


}
