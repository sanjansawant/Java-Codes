package com.Sanjan;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        output(gameOver,score,levelCompleted,bonus);


        output(gameOver,10000,8,200);
    }

    public static void output(boolean gameOver,int score,int levelCompleted,int bonus){

        if(gameOver==true) {
            int result = score + (levelCompleted * bonus);
            System.out.println(result);
        }
    }

}
