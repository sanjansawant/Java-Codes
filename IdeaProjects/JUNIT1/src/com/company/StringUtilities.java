package com.company;

/**
 * Created by sanja on 4/1/2017.
 */
public class StringUtilities {

    private StringBuilder sBuilder=new StringBuilder();
    private int charsAdded=0;

    public void addChar(StringBuilder sBuilder, char c){
        sBuilder.append(c);
        this.charsAdded++;

    }

    public String upperAndPrefix(String str){
        String upper=str.toUpperCase();
        return "Prefix_"+upper;
    }

    public String addSuffix(String str){
        return str+"_Suffix";
    }

}
