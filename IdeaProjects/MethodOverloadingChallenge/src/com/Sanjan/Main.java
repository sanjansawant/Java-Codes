package com.Sanjan;

public class Main {

    public static void main(String[] args) {
        System.out.println(feetAndInchesToCentimeters(6,-10));
        System.out.println(feetAndInchesToCentimeters(-10));

    }

    public static double feetAndInchesToCentimeters(int feet,int inches){

        if((feet>=0) && (inches>=0 && inches<=12)){
            double totalCentimeter=(feet*12)*2.54;
            totalCentimeter+=(inches*2.54);
            return totalCentimeter;

        }else{
            return -1;
        }

    }


    public static double feetAndInchesToCentimeters(int inches){

        if(inches>=0){
            int feet=inches/12;
            System.out.println("feet is "+feet);
            inches=inches%12;
            return(feetAndInchesToCentimeters(feet,inches));


        }else{
            return -1;
        }

    }

}
