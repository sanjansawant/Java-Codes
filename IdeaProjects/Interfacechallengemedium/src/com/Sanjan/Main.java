package com.Sanjan;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here


        Player Tim=new Player("tim",100,50,"sword");
        System.out.println(Tim.toString());
        saveObject(Tim);

        Tim.setWeapon("Storm");
        Tim.setHitPoints(10);
        saveObject(Tim);
        System.out.println("=================");
        loadObject(Tim);



    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(IMedium value){

        for(int i=0;i<value.write().size();i++){


            System.out.println("values "+value.write().get(i));

        }
    }

    public static void loadObject(IMedium values){

        ArrayList<String> values1=readValues();
        values.read(values1);
        System.out.println(values.toString());


    }





}
