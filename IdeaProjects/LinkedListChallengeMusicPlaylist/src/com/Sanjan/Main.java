package com.Sanjan;


import java.util.*;
public class Main {
    private static ArrayList<Album> albums=new ArrayList<>();
    private static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {

        Album tamasha=new Album("tamasha");


        tamasha.addSong("Matargashti",5);
        tamasha.addSong("Heer Toh Badi Sad Hai",5.6);
        tamasha.addSong("Tum Saath Ho",6.7);
        tamasha.addSong("Wat Wat Wat",6.2);
        tamasha.addSong("Chali Kahani ",5.6);
        tamasha.addSong("Safarnama",6.2);
        albums.add(tamasha);

        Album srk=new Album("srk");
        srk.addSong("kal ho naa ho",6.5);
        srk.addSong("mitwa",5.6);
        srk.addSong("shaadi",6.7);
        srk.addSong("phas gaya",5.6);
        srk.addSong("jaanu",9.2);
        srk.addSong("khushi",3.4);
        albums.add(srk);

        LinkedList<Song> playList=new LinkedList<>();
        tamasha.addToPlaylist("Matargashti",playList);
        albums.get(1).addToPlayListViaTrack(6,playList);
        tamasha.addToPlaylist("Tum Saath Ho",playList);
        tamasha.addToPlaylist("Safarnama",playList);
        tamasha.addToPlayListViaTrack(4,playList);
        srk.addToPlaylist("phas gaya",playList);
        srk.addToPlaylist("faltu",playList);




        boolean flag=true;
        boolean goingForward=true;
        printOptions();

        ListIterator<Song> listIterator=playList.listIterator();

        if(playList.size()==0){
            System.out.println("no songs in the playlist");
        }else {


            System.out.println("now playing==> " + listIterator.next().getTitle());
        }
        while (flag) {
                System.out.println("Enter your choice: ");
                int number = input.nextInt();
                input.nextLine();
                switch (number) {
                    case 0:
                        System.out.println("playlist complete");
                        flag = false;
                        break;
                    case 1:
                        //moveforward in the playlist
                        if (!goingForward) {
                            if (listIterator.hasNext()) {
                                listIterator.next();
                            }
                            goingForward = true;
                        }

                        if (listIterator.hasNext()) {
                            System.out.println("now visiting==> " + listIterator.next().getTitle());

                        } else {
                            System.out.println("end of the playlist");
                            goingForward = false;
                        }
                        break;
                    case 2:
                        //movebackward;

                        if (goingForward) {
                            if (listIterator.hasPrevious()) {
                                listIterator.previous();
                            }
                            goingForward = false;
                        }

                        if (listIterator.hasPrevious()) {
                            System.out.println("now visiting==> " + listIterator.previous().getTitle());

                        } else {
                            System.out.println("reached at the begining");
                            goingForward = true;
                        }
                        break;
                    case 3:
                        //repeat the song
                        if (goingForward) {
                            if (listIterator.hasPrevious()) {
                                System.out.println(listIterator.previous().getTitle());
                            }
                            goingForward = false;
                        } else {
                            if (listIterator.hasNext()) {
                                System.out.println(listIterator.next().getTitle());
                            }
                            goingForward = true;

                        }
                        break;
                    case 4:
                        playListDisplay(playList);
                        break;
                    case 5:
                        printOptions();

                        break;
                    case 6:
                       /* if(playList.size()>0){
                        if(goingForward){
                            if (listIterator.hasPrevious()){
                                listIterator.previous();
                                listIterator.remove();
                                goingForward=false;
                            }else{
                                System.out.println("we are at the begin");
                            }
                        }else{
                            if (listIterator.hasNext()){
                                listIterator.next();
                                listIterator.remove();
                                goingForward=true;
                            }else{
                                System.out.println("we are at the end");
                            }
                        }}else{
                            System.out.println("no songs now");
                        }*/
                        if(playList.size()>0){

                            listIterator.remove();
                            if(listIterator.hasNext()){
                                System.out.println("now playing "+listIterator.next());
                            }else if(listIterator.hasPrevious()){
                                System.out.println("now playing "+listIterator.previous());
                            }

                        }

                        break;
                    case 7:
                        //remove song
                        displayAlbumSongs();
                        break;

                }
            }



    }

    private static void printOptions(){

        System.out.println("0==> quit\n1==>moveforward\n2==>movebackward\n3==>repeat the song\n" +
                "4==>playlist songs display\n5==>printoptions" +
                "6==>remove from playlist\n" +
                "7==>display all albums with songs");


    }



    private static void displayAlbumSongs(){

        for(int i=0;i<albums.size();i++){

            System.out.println(albums.get(i).getSongs());

        }
    }

    private static void playListDisplay(LinkedList<Song> playList){

        ListIterator<Song> listIterator=playList.listIterator();
        System.out.println("================================");
        while(listIterator.hasNext()){

            System.out.println("now playing "+listIterator.next().getTitle());
        }
        System.out.println("================================");

    }
}
