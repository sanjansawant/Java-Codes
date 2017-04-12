package com.sanjan.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    private static Scanner input=new Scanner(System.in);
    private static ArrayList<Album> newAlbum=new ArrayList<>();
    public static void main(String[] args) {

        Album ShahrukhKhan=new Album("shahrukh","combined");
        ShahrukhKhan.addSongs("Mitwa",6.5);
        ShahrukhKhan.addSongs("kabhi alvida naa kehna",7.2);
        ShahrukhKhan.addSongs("kabhi haa kabhi naa",4.5);
        ShahrukhKhan.addSongs("kabhi khushi kabhi gham",8.2);
        ShahrukhKhan.addSongs("kal hoo naa ho",5.4);
        ShahrukhKhan.addSongs("kabhi haa kabhi naa",4.5);
        newAlbum.add(ShahrukhKhan);


        Album SalmanKhan=new Album("SalmanKhan","combined");
        SalmanKhan.addSongs("dabanng",5.6);
        SalmanKhan.addSongs("sultan",6.3);
        SalmanKhan.addSongs("wanted",4.5);
        SalmanKhan.addSongs("garv",5.6);
        SalmanKhan.addSongs("tubelight",5.6);
        SalmanKhan.addSongs("wanted",4.5);
        newAlbum.add(SalmanKhan);

        ArrayList<Song> playList=new ArrayList<>();
        newAlbum.get(0).addToPlayList(1,playList);
        newAlbum.get(0).addToPlayList(2,playList);
        newAlbum.get(0).addToPlayList(3,playList);
        newAlbum.get(1).addToPlayList(4,playList);
        newAlbum.get(1).addToPlayList(3,playList);
        newAlbum.get(1).addToPlayList("wanted",playList);
        newAlbum.get(1).addToPlayList(1,playList);
        newAlbum.get(1).addToPlayList(5,playList);

        display(playList);

    }

    public static void printMenu(){

        System.out.println("0==>Print Menu\n" +
                "1==>go forward\n" +
                "2==>go previous\n" +
                "3==>repeat the song\n" +
                "4==> delete the song\n" +
                "5==> list the songs in playList\n"+
                "6==>quit the application");
    }

    public static void display(List<Song> playList){

        ListIterator<Song> listIterator=playList.listIterator();
        boolean flag=true;
        boolean movingForward=true;
        printMenu();
        System.out.println("Now Playing "+listIterator.next());
        while(flag){


            System.out.println("Enter your choice");

            int number=input.nextInt();
            switch(number){

                case 0:
                    printMenu();
                    break;
                case 1:
                    if(!movingForward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        movingForward=true;
                    }

                    if(listIterator.hasNext()){
                        System.out.println("Now Playing "+listIterator.next());
                    }else{
                        System.out.println("we have reached the end");
                        movingForward=false;
                    }
                    break;

                case 2:
                    if(movingForward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        movingForward=false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now Playing "+listIterator.previous());
                    }else{
                        System.out.println("we have reached the end");
                        movingForward=false;
                    }
                    break;

                case 3:
                    if(movingForward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Now Playing "+listIterator.previous());
                            movingForward=false;
                        }

                    }else if(!movingForward){
                        if(listIterator.hasNext()){
                            System.out.println("Now Playing "+listIterator.next());
                            movingForward=true;
                        }

                    }
                    break;

                case 4:
                    listIterator.remove();
                    if(listIterator.hasNext()){
                        System.out.println("Now Playing "+listIterator.next());
                    }else{
                        System.out.println("Now Playing "+listIterator.previous());
                    }
                    break;

                case 5:
                    for(Song songs:playList){

                        System.out.println(songs);
                    }
                    break;



                case 6:
                    flag=false;
                    break;



            }
        }





    }



}
