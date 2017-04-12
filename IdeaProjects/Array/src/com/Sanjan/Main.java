package com.Sanjan;
import java.util.*;
public class Main {
    private static Scanner input=new Scanner(System.in);

    public static void main(String[] args) {
	    int[] array=getNumbers(5);

	    double average=avg(array);
        System.out.println("average is "+average);

    }


    public static int[] getNumbers(int number){

        int[] array=new int[number];
        System.out.println("Enter the numbers: \r");
        for(int i=0;i<array.length;i++){
            array[i]=input.nextInt();

        }

        return array;
    }

    public static double avg(int[] array){
        double sum=0;

        for(int i=0;i<array.length;i++){

            sum=sum+array[i];

        }
        return (sum/array.length);
    }


}
