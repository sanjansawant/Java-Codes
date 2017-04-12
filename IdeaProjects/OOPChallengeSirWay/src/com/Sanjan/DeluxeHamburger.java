package com.Sanjan;

/**
 * Created by sanja on 1/1/2017.
 */
public class DeluxeHamburger extends BasicHamburger{


    public DeluxeHamburger(String breadRollType, String meat, int price) {
        super("deluxehamburger",breadRollType, meat, price);
        super.addItem1("drinks",0);
        super.addItem2("chips",0);
    }


    @Override
    public void addItem1(String item1, double item1price) {
        System.out.println("Item cannot be added");
    }

    @Override
    public void addItem2(String item2, double item2price) {
        System.out.println("Item cannot be added");
    }

    @Override
    public void addItem3(String item3, double item3price) {
        System.out.println("Item cannot be added");
    }

    @Override
    public void addItem4(String item4, double item4price) {
        System.out.println("Item cannot be added");
    }

}
