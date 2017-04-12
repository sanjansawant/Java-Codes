package com.Sanjan;

public class Main {

    public static void main(String[] args) {

        int position=calculateHighScorePosition(1500);
        displayHighScorePosition("sanjan",position);
        position=calculateHighScorePosition(900);
        displayHighScorePosition("sanjan",position);
        position=calculateHighScorePosition(400);
        displayHighScorePosition("sanjan",position);
        position=calculateHighScorePosition(50);
        displayHighScorePosition("sanjan",position);


    }

    public static void displayHighScorePosition(String name,int position){

        System.out.println("Players name= "+name+", managed to get into position "+position);


    }

    public static int calculateHighScorePosition(int score){

        if(score>=1000){
            return 1;
        }else if(score>=500 && score<1000){
            return 2;
        }else if(score>100 && score<500){
            return 3;
        }else{
            return 4;
        }


    }
}
