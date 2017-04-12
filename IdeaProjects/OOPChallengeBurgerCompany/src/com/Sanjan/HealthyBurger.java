package com.Sanjan;

/**
 * Created by sanja on 12/31/2016.
 */
public class HealthyBurger extends BasicHamburger {


    public HealthyBurger( double price, String meat) {

        super("brown rye bread roll", price, meat);
        setCount(6);


    }

    @Override
    public void addItem(String item, double price) {
        super.addItem(item, price);
    }
}
