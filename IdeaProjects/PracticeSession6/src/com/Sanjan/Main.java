package com.Sanjan;

public class Main {

    public static void main(String[] args) {

        int evenCount=0;
        for(int i=0;i<=100;i++){
            if(isEven(i)){
                if(evenCount<5) {
                    System.out.println("even= " + i);
                }else{
                    break;
                }
                evenCount++;

            }else{
                System.out.println("odd= "+i);
            }
        }
    }

    public static boolean isEven(int number){

        if(number%2==0){

            return true;
        }else{
            return false;
        }


    }


}
