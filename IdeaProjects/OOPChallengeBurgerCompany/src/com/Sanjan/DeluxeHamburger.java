package com.Sanjan;

/**
 * Created by sanja on 12/31/2016.
 */
public class DeluxeHamburger extends BasicHamburger{

    public DeluxeHamburger(String rollType, double price, String meat) {
        super(rollType, price, meat);
        setCount(2);
        addItem("chips",0);
        addItem("drinks",0);
    }




}
