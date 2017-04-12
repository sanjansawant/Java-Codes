package com.Sanjan;
import java.util.*;
public class Main {

    public static void main(String[] args) {

        ISaveable Tim=new Player("tim",56,65,"sword");
        System.out.println(((Player)Tim).getName());
        loadObject(Tim);
        System.out.println(Tim);
        saveObject(Tim);
        loadObject(Tim);



    }




    public static void loadObject(ISaveable name){

        for(int i=0;i<name.write().size();i++){

            System.out.println(name.write().get(i));

        }

    }

    public static void saveObject(ISaveable name){

        List<String> values=readValues();
        name.read(values);
        name.toString();


    }


    public static List<String> readValues(){

        List<String> values=new ArrayList<>();

        boolean flag=true;
        while(flag) {
            System.out.println("Enter your choice\n1==>to enter a string\n0==>to quit");
            Scanner input=new Scanner(System.in);
            int choice=input.nextInt();
            input.nextLine();

            switch(choice){

                case 0:
                    flag=false;
                    break;
                case 1:
                    System.out.println("Enter a value");
                    String value=input.nextLine();
                    values.add(value);

            }

        }

        return values;
    }
}
