package com.Sanjan;


import java.util.*;

public class Main {
    private static List<Album> albums=new ArrayList<>();
    public static void main(String[] args) {

        Album tamasha=new Album("tamasha");
        tamasha.addSong("Matargashti",5);
        tamasha.addSong("Heer Toh Badi Sad Hai",5);
        tamasha.addSong("Tum Saath Ho",6);
        tamasha.addSong("Wat Wat Wat",6);
        tamasha.addSong("Chali Kahani ",5);
        tamasha.addSong("Safarnama",6);
        albums.add(tamasha);

        Album srk=new Album("srk");
        srk.addSong("kal ho naa ho",6);
        srk.addSong("mitwa",5);
        srk.addSong("shaadi",6);
        srk.addSong("phas gaya",5);
        srk.addSong("jaanu",9);
        srk.addSong("khushi",3);
        albums.add(srk);

        LinkedList<Song> playList=new LinkedList<>();
        tamasha.addToPlayList("Matargashti",playList);
        albums.get(1).addToPlayList(6,playList);
        tamasha.addToPlayList("Tum Saath Ho",playList);
        tamasha.addToPlayList("Safarnama",playList);
        tamasha.addToPlayList(4,playList);
        srk.addToPlayList("phas gaya",playList);
        srk.addToPlayList("faltu",playList);

        System.out.println(String.format("%.2f",232.32323232323));



    }
}
