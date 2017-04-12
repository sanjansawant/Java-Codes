package com.sanjan.algorithms;

import java.util.*;

/**
 * Created by sanja on 1/30/2017.
 */
public class SetMain {
    public static void main(String[] args) {

        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for (int i = 1; i <= 100; i++) {
            squares.add(i * i);
            cubes.add(i * i * i);
        }
        System.out.println("Squares size " + squares.size() + " & Cubes size " + cubes.size());


        Set<Integer> union = new HashSet<>(squares);
        union.addAll(cubes);
        System.out.println("unioun " + union.size());

        Set<Integer> Intersection = new HashSet<>(squares);
        Intersection.retainAll(cubes);
        System.out.println(Intersection.size() + " intersection");

        System.out.println(squares.containsAll(Intersection));

        Set<Integer> asymmetry = new HashSet<>(squares);
        asymmetry.removeAll(cubes);

        System.out.println("Asymmetry " + asymmetry.size());

        System.out.println("Symmetry is " + (union.size() - Intersection.size()));
        Iterator<Integer> iterator = union.iterator();
        System.out.println("=================================");
      /*  while(iterator.hasNext()){

            System.out.println(iterator.next());
        }*/
        System.out.println("+++++++++++++++++++++++++++++++++");

        String[] divine = {"to", "is", "thee", "all", "unknown", "art", "nature", "but"};
        String[] nature = {"to", "is", "err", "humans", "forgive", "divine"};

        Set<String> divineSet = new HashSet<>(Arrays.asList(divine));
        Set<String> natureSet = new HashSet<>(Arrays.asList(nature));

        Set<String> asymmetrical = new HashSet<>(natureSet);
        asymmetrical.removeAll(divineSet);

        for (String s : asymmetrical) {

            System.out.println(s);
        }

        Set<String> unionall = new HashSet<>(natureSet);
        unionall.addAll(divineSet);
        System.out.println("======");
        Set<String> intersectionAll = new HashSet<>(natureSet);
        intersectionAll.retainAll(divineSet);

        System.out.println("=======");
        Set<String> symmetrical = new HashSet<>(unionall);
        symmetrical.removeAll(intersectionAll);

        for (String s : symmetrical) {
            System.out.println("\t" + s);
        }
        String number = Integer.toBinaryString(439);
        System.out.println(number);
        String[] array = number.split("");

        int count = 0;
        int sum = 1;
        int sum1 = 0;
        for (int i = 0; i < array.length - 1; i++) {

            if (Integer.parseInt(array[i]) == 1) {

                for (int j = i + 1; j < array.length; j++) {

                    if (Integer.parseInt(array[j]) == 1) {

                        count=1;
                        sum += count;
                        System.out.println("==>"+sum);
                    } else {
                        if (sum > sum1) {
                            sum1 = sum;
                        }
                        sum = 0;
                        count = 0;
                    }


                }

            }
            break;
        }
        System.out.println(sum1>sum?sum1:sum);
        System.out.println(sum);

    }
}
