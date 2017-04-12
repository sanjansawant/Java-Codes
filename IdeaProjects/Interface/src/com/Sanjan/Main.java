package com.Sanjan;

public class Main {

    public static void main(String[] args) {

        ITelephone telephone=new Desktop("123456");
        telephone.powerOn();
        telephone.dial("123456");
        telephone.answer();
        telephone.callPhone("123456");
        telephone.isRinging();
        System.out.println("==============");

        telephone=new MobilePhone("456789");
        //telephone.powerOn();
        telephone.callPhone("456789");
    }
}
