package com.sanjan.algorithms;

/**
 * Created by sanja on 1/30/2017.
 */
public class ComparisonTwoStrings {
    private static String name="Sanjan";
    public static void main(String[] args) {
        //System.out.println(name.charAt(0));
        System.out.println(equalscase("Sanjana"));

    }

    public static boolean equalscase(Object name1){

        if(name1 instanceof String){

            String anotherName=(String)name1;
            int number=anotherName.length();
            int number2=name.length();

            if(number==number2){
                int number3=number-1;
                while(number3>=0){
                    if(anotherName.charAt(number3)!=name.charAt(number3)){
                        return false;
                    }
                    number3--;
                }

                return true;

            }

        }return false;


    }

}
