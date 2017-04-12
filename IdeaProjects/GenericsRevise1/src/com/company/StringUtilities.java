package com.company;

/**
 * Created by sanja on 4/3/2017.
 */
public class StringUtilities {

    private StringBuilder sBuilder;
    private int charCount=0;

    public void add(StringBuilder sBuilder, int count){
        sBuilder.append(count);
        this.charCount++;
    }

}
