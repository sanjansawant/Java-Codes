package com.Sanjan;

/**
 * Created by sanja on 12/31/2016.
 */
public class BasicHamburger {

    private String breadRollType;
    private String meat;
    private int price;
    private String name;

    private String item1;
    private double item1price=0;

    private String item2;
    private double item2price=0;

    private String item3;
    private double item3price=0;

    private String item4;
    private double item4price=0;

    public BasicHamburger(String name, String breadRollType, String meat, int price) {
        this.name=name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
    }

    public void addItem1(String item1, double item1price){
        this.item1=item1;
        this.item1price=item1price;
        System.out.println(item1+" added "+item1price);
    }


    public void addItem2(String item2, double item2price){
        this.item2=item2;
        this.item2price=item2price;
        System.out.println(item2+" added "+item2price);
    }


    public void addItem3(String item3, double item3price){
        this.item3=item3;
        this.item3price=item3price;
        System.out.println(item3+" added "+item3price);
    }

    public void addItem4(String item4, double item4price){
        this.item4=item4;
        this.item4price=item4price;
        System.out.println(item4+" added "+item4price);
    }

    public double itemizeHamburger(){
        int hamburgerPrice=this.price;
        System.out.println(this.name + " hamburger " + " on a " + this.breadRollType + " roll "
                + "with " + this.meat + ", price is "  + this.price);

        if(this.item1!=null){
            hamburgerPrice+=item1price;
            System.out.println("Added " + this.item1 + " for an extra " + this.item1price);
        }
        if(this.item2!=null){
            hamburgerPrice+=item2price;
            System.out.println("Added " + this.item2 + " for an extra " + this.item2price);
        }
        if(this.item3!=null){
            hamburgerPrice+=item3price;
            System.out.println("Added " + this.item3 + " for an extra " + this.item3price);
        }
        if(this.item4!=null){
            hamburgerPrice+=item4price;
            System.out.println("Added " + this.item4 + " for an extra " + this.item4price);
        }

        return  hamburgerPrice;



    }





}
