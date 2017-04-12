package com.company;

public class Main {

    public static void main(String[] args) {

        Album album=new Album("abcdef",6);
        album.setSong("A",1.2);
        album.setSong("B",1.3);
        album.setSong("C",1.4);
        album.setSong("D",1.5);
        album.setSong("E",1.6);
        album.setSong("F",1.7);
        album.setSong("G",1.8);
        album.setSong("H",1.9);

        for(Album.Song song:album.getSongs()){

            System.out.println(song.getName());

        }

    }
}
