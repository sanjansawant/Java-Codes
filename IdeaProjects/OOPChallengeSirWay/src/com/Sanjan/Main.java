package com.Sanjan;

public class Main {

    public static void main(String[] args) {
        BasicHamburger ham1=new BasicHamburger("basic","normal","beef",10);
        System.out.println(ham1.itemizeHamburger());
        ham1.addItem1("ce",2);
        //System.out.println(ham1.itemizeHamburger());
        ham1.addItem2("cae",3);
        //System.out.println(ham1.itemizeHamburger());
        ham1.addItem3("ke",4);
        //System.out.println(ham1.itemizeHamburger());
        ham1.addItem4("ake",5);
        //System.out.println(ham1.itemizeHamburger());
        ham1.addItem1("ssscake",6);
        System.out.println(String.format("%.2f",ham1.itemizeHamburger()));

        System.out.println("=========================================================");
        DeluxeHamburger db=new DeluxeHamburger("normal","cow",20);

        db.addItem3("banana",30);
        System.out.println(db.itemizeHamburger());


    }
}
