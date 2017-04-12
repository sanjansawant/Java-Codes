package com.Sanjan;

/**
 * Created by sanja on 12/31/2016.
 */
public class Car {

    private String name;
    private int tires;
    private int doors;
    private String color;


    public void setName(String name){
        if(name=="porsche" || name=="careera"){
            this.name=name;
        }else{
            this.name="unknown";
        }
    }


    public String getName(){
        return this.name;
    }
}
