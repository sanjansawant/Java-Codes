package com.company;

/**
 * Created by sanja on 3/27/2017.
 */
public class DeluxeHamburger extends Hamburger {
    private String rolltype;
    private String meat;
    private double prioe;

    private String item5;
    private double item5Price;

    private String item6;
    private double item6Price;


    public DeluxeHamburger(String meat, double prioe) {
      super("normal",meat,prioe);
    }


    public double getPrioe() {
        return prioe;
    }

    public final void setItem5(String item5,double price){
        this.item5=item5;
        this.item5Price=price;
        this.prioe+=item5Price;
    }

    public final void setItem6(String item6,double price){
        this.item6=item6;
        this.item6Price=price;
        this.prioe+=item6Price;
    }
}
