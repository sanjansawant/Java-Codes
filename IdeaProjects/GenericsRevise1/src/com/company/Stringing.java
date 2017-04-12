package com.company;

/**
 * Created by sanja on 4/3/2017.
 */
public class Stringing {


    public static void main(String[] args) {
        StringUtilities utils=new StringUtilities();
        StringBuilder sb=new StringBuilder();
        while(sb.length()<10) {
            utils.add(sb,'a');
        }
    }
}
