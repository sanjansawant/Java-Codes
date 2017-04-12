package com.Sanjan;

public class Main {

    public static void main(String[] args) {

        Printer sanjan=new Printer(true,200,-89);

        System.out.println(sanjan.getPagesPrinted(100));
        System.out.println(sanjan.getTonerLevel());
        System.out.println(sanjan.fillToner(-100));
        System.out.println("==> ==<"+sanjan.getTonerLevel());
        System.out.println(sanjan.getPagesPrinted(100));


        Printer nanjan=new Printer(false,200,50);
        System.out.println(nanjan.getPagesPrinted(100));
        System.out.println(nanjan.getTonerLevel());
        System.out.println("==> "+nanjan.fillToner(51));

        Printer anjan=new Printer(false,200,106);
        System.out.println(anjan.getPagesPrinted(200));
        System.out.println(anjan.getTonerLevel());
    }
}
