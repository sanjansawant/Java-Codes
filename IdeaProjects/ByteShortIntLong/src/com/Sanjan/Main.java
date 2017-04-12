package com.Sanjan;

public class Main {

    public static void main(String[] args) {
        //int has a width of 32
        int myMinValue=-2_147_483_648;
        int myMaxValue=2_147_483_647;

        //byte has a width of 8
        byte byteMinValue=-128;
        byte byteMaxValue=127;

        //short has a with of 16
        short shortMinValue=-32768;
        short shortMaxValue=32767;

        //long has a width of 64
        long longMinValue=-9_223_372_036_854_775_808L;
        long longMaxValue=9_223_372_036_854_775_807L;

        //datatype variableName = literal(fixed Number)
        byte value=(byte)(byteMinValue/3);

        //datatype variableName=*(not literal) it is an expression
        System.out.println(value);


        byte test1=-10;
        short test2=-70;
        int test3=-278;
        long test4=50000L+10*(test1+test2+test3);
        short test5=(short)(500+10*(test1+test2+test3));
        System.out.println(test5);
    }
}
