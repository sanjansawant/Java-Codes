package com.company;

public class Main {

    public static void main(String[] args) {

        Printer printer=new Printer(200,100,true);
        printer.addTonerLevl(90);
        System.out.println(printer.getTonerLevel());
        System.out.println(printer.numberOfPagesPrinted());

    }
}
