package com.Sanjan;

public class Main {

    public static void main(String[] args) {

        int value=1;
        int value2=0;
        switch (value2 = value+1){
            case 2 :
                System.out.println(value2);
                value2++;
                System.out.println(value2);

                break;

            case 4:System.out.println(value);
                break;



        }


        String c="E";

        switch (c.toLowerCase()){
            case "A":
                System.out.println(c);
                break;
            case "B":
                System.out.println(c);
                break;
            case "C":
                System.out.println(c);
                break;
            case "D":

            case "E":
                System.out.println(c);
                break;
            default:
                System.out.println("error");
        }
    }
}
