package com.Sanjan;

/**
 * Created by sanja on 12/31/2016.
 */
public class HealthyBurger extends BasicHamburger {

    private String item5;
    private double item5price=0;

    private String item6;
    private double item6price=0;


    public HealthyBurger( String meat, int price) {

        super("healthyBurger","brown rye bread roll", meat, price);
    }

    public void addItem5(String item5, double item5price){
        this.item5=item5;
        this.item5price=item5price;
        System.out.println(item5+" added "+item5price);
    }

    public void addItem6(String item6, double item6price){
        this.item6=item6;
        this.item6price=item6price;
        System.out.println(item6+" added "+item6price);
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice=itemizeHamburger();

        if(item5!=null){
            hamburgerPrice+=item5price;
        }
        if(item6!=null){
            hamburgerPrice+=item6price;
        }

        return (hamburgerPrice+item5price+item6price);
    }
}
