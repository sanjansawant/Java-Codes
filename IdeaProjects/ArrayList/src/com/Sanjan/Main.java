package com.Sanjan;
import java.util.*;
public class Main {
    private static Scanner input=new Scanner(System.in);
    private static GroceryList groceryList=new GroceryList();
    private static String[] newArray=new String[groceryList.getGroceryList().size()];
    public static void main(String[] args) {

        boolean quit=true;
        printInstructions();
        int choice=0;
        while(quit){
            System.out.println("Enter your choice");
            choice=input.nextInt();
            input.nextLine();
            switch(choice){

                case 0:printInstructions();
                    break;
                case 1:
                    groceryList.printGrocery();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    findItem();
                    break;
                case 6:
                    processArrayList();
                    break;

                case 7:
                    quit=false;
            }
        }
    }

    public static void processArrayList(){


        ArrayList<String> new1=new ArrayList<>();
        new1.addAll(groceryList.getGroceryList());

        ArrayList<String> new2=new ArrayList<>(groceryList.getGroceryList());

        newArray=groceryList.getGroceryList().toArray(newArray);
        for(int i=0;i<newArray.length;i++){

            System.out.println(newArray[i]);
        }


        ArrayList<String> newGroceryList=new ArrayList<>(Arrays.asList(newArray));

    }



    public static void printInstructions(){

        System.out.println("print options");

    }

    public static void addItem(){

        System.out.println("Enter an item");
        groceryList.addItem(input.nextLine());
    }

    public static void modifyItem(){


        System.out.println("enter replacement item");
        groceryList.modifyItem(input.nextLine());
    }

    public static void removeItem(){
        System.out.println("enter the item number");
        String itemnumber=input.nextLine();


        groceryList.removeItem(itemnumber);
    }

    public static void findItem(){
        System.out.println("enter item to be searched from");
        String search=input.nextLine();
        String item=groceryList.findItem(search);

        if(item==null){
            System.out.println("item not found");
        }else{
            System.out.println("item is in the lsit");
        }
    }
}
