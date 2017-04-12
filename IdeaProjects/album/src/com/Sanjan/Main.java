package com.Sanjan;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        Album knph=new Album("knph",5);
        knph.addSong("koi mil",5.4,"rakesh");
        knph.addSong("hum do",5.6,"rakesh");
        knph.addSong("kuch kuch",9.8,"rakesh");
        knph.addSong("koi mil",6.4,"rakesh");

        knph.removeSong("kuch kuch");
        knph.displaySongs();



        Album knph1=new Album("knph1",5);
        knph1.addSong("koi mil",5.4,"rakesh");
        knph1.addSong("hum do",5.6,"rakesh");
        knph1.addSong("kuch kuch",9.8,"rakesh");
        knph1.addSong("koi mil",6.4,"rakesh");
        knph1.addSong("huch huch",9.8,"rakesh");
        knph1.addSong("buch buch",9.8,"rakesh");
        knph1.addSong("such such",9.8,"rakesh");


        knph1.displaySongs();
        LinkedList<Song> playList=new LinkedList<>();



    }
}
