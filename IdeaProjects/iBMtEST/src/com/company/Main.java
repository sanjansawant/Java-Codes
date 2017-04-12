package com.company;
import java.util.*;
public class Main {
    private static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a String");
        String string=input.nextLine();

        String newString=string.replaceAll("[^a-zA-Z0-9\\s\\|]","");

        String[] array=newString.split("\\|");

        LinkedList<String> list=new LinkedList<>(Arrays.asList(array));

        ListIterator<String> listiterator=list.listIterator();
        List<String> newList=new LinkedList<>();
        while(listiterator.hasNext()){
            if(newList.size()<=0){

                newList.add(listiterator.next());
            }else{

                String newString1=listiterator.next();




            }





        }


    }
}
