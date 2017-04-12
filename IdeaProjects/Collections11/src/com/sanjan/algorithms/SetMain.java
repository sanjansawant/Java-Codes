package com.sanjan.algorithms;

import java.util.*;

/**
 * Created by sanja on 1/21/2017.
 */
public class SetMain {

    public static void main(String[] args) {
        Set<Integer> squares=new HashSet<>();
        Set<Integer> cubes=new HashSet<>();

        for(int i=1;i<=100;i++){

            squares.add((int)Math.pow(i,2));
            cubes.add((int)Math.pow(i,3));

        }

        System.out.println("There are "+squares.size()+" square and "+cubes.size()+" cubes.");
        Set<Integer> union=new HashSet<>(squares);
        union.addAll(cubes);

        System.out.println("Union contains "+union.size()+" elements");

        Set<Integer> intersection=new HashSet<>(squares);
        intersection.retainAll(cubes);
        System.out.println("Intersection contains "+intersection.size()+" elements");
        for(int i:intersection){
            System.out.println(i+" is sqrt of "+Math.sqrt(i)+" and cbrt of "+Math.cbrt(i));
        }



        union=new HashSet<>(squares);
        union.containsAll(cubes);
        System.out.println(union.size()+" subset");

        union=new HashSet<>(squares);
        union.removeAll(cubes);
        System.out.println(union.size()+" of s1");

        Set<String> words=new HashSet<>();

        String sentence="One day in the year of the fox";
        String[] array=sentence.split(" ");
        words.addAll(Arrays.asList(array));

        for(String i:words){
            System.out.println(i);
        }

        Set<String> nature=new HashSet<>();
        Set<String> divine=new HashSet<>();

        String[] natureWords={"all","nature","is","but","art","unknown","to","the"};
        String[] divineWords={"to","err","is","human","to","forgive","divine"};

        nature.addAll(Arrays.asList(natureWords));
        divine.addAll(Arrays.asList(divineWords));

        Set<String> aSymmetric=new HashSet<>(nature);
        aSymmetric.removeAll(divine);
        System.out.println("======");
        for(String s: aSymmetric){

            System.out.println(s);
        }

        aSymmetric=new HashSet<>(divine);
        aSymmetric.removeAll(nature);
        System.out.println("======");
        for(String s: aSymmetric){

            System.out.println(s);
        }

        Set<String> unionTest=new HashSet<>(nature);
        unionTest.addAll(divine);
        System.out.println("======");
        for(String s:unionTest){
            System.out.println(s);
        }

        Set<String> IntersectionTest=new HashSet<>(nature);
        IntersectionTest.retainAll(divine);
        System.out.println("======");
        for(String s:IntersectionTest){
            System.out.println(s);
        }

        unionTest.removeAll(IntersectionTest);
        System.out.println("======");
        for(String s:unionTest){
            System.out.println(s);
        }



    }

}
