package com.sanjan.algorithms;
import java.util.*;
import java.util.regex.*;
/**
 * Created by sanja on 2/2/2017.
 */
public class HackerRankRegex {

    private static Scanner input=new Scanner(System.in);


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int number=input.nextInt();
            List<String> hackerRank=new LinkedList<>();
        input.nextLine();
        while(number>0){
            String name=input.nextLine();


            if(matching(name)){
                hackerRank.add(name);
            }
            number--;
        }
        Collections.sort(hackerRank);

        for(String i:hackerRank){
            String[] array=i.split(" ");

            String name=array[0];

            System.out.println(name);
        }
    }


    public static boolean matching(String name){

        String[] array=name.split(" ");

        name=array[0];
        String email=array[1];
        Pattern pattern=Pattern.compile("^[a-z]{1,20}");
        Matcher matcher=pattern.matcher(name);

        if(matcher.matches()){

            Pattern pattern1=Pattern.compile("^[a-z\\.]{1,20}@{1}gmail.com{1}");
            Matcher matcher1=pattern1.matcher(email);
            if(matcher1.matches()){
                return true;
            }

        }
            return false;
    }

}
