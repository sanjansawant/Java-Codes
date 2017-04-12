package com.company;

/**
 * Created by sanja on 3/27/2017.
 */
public class Hamburger {

    private String rolltype;
    private String meat;
    private double prioe;

    private String item1;
    private double item1Price;

    private String item2;
    private double item2Price;

    private String item3;
    private double item3Price;

    private String item4;
    private double item4Price;


    public Hamburger(String rolltype, String meat, double prioe) {
        this.rolltype = rolltype;
        this.meat = meat;
        this.prioe = prioe;
    }

    public final void setItem1(String item1,double price){
        this.item1=item1;
        this.item1Price=price;
        this.prioe+=item1Price;
    }

    public final void setItem2(String item2,double price){
        this.item2=item2;
        this.item2Price=price;
        this.prioe+=item2Price;
    }

    public final void setItem3(String item3,double price){
        this.item3=item3;
        this.item3Price=price;
        this.prioe+=item3Price;
    }

    public final void setItem4(String item4,double price){
        this.item4=item4;
        this.item4Price=price;
        this.prioe+=item4Price;
    }



    public double getPrioe() {
        return prioe;
    }
}
