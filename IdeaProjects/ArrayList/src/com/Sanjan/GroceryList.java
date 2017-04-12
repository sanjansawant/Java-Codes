package com.Sanjan;

import java.util.ArrayList;
import java.util.*;
/**
 * Created by sanja on 1/4/2017.
 */
public class GroceryList {
    private static Scanner input=new Scanner(System.in);
    private ArrayList<String> groceryList=new ArrayList<>();




    public void addItem(String item){
        groceryList.add(item);
        System.out.println("item added");
    }

    public void removeItem(String name){


        if(queryGrocery(name)){
            int position=getPosition(name);
            groceryList.remove(position);
            System.out.println("item successfully removed");
        }else{
            System.out.println("item not found");
        }

    }

    public void printGrocery(){

        for(int i=0;i<groceryList.size();i++){

            System.out.println((i+1)+" item is= " +groceryList.get(i));
        }
    }

    private int getPosition(String item){
        return (groceryList.indexOf(item));
    }


    public void modifyItem(String item){
        int position=getPosition(item);
        System.out.println("enter replacement item");
        String newItem=input.nextLine();
        groceryList.set(position,newItem);
        System.out.println((position+1)+" replaced with "+newItem);

    }

    private boolean queryGrocery(String item){

        for(int i=0;i<groceryList.size();i++){

            if(groceryList.get(i).equalsIgnoreCase(item)){
                return true;
            }
        }
        return false;
    }

    public String findItem(String item){

        boolean condition=groceryList.contains(item);
        System.out.println("condition is "+ condition);

        int position=groceryList.indexOf(item);

        if(position>=0){
            return groceryList.get(position);
        }else{
            return null;
        }
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }
}
