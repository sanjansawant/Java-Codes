package com.Sanjan;

public class Main {

    public static void main(String[] args) {

        String var4="THIS is inside main()";

        ScopeCheck checking=new ScopeCheck();
        System.out.println(var4);
        System.out.println("scope instance var1 is "+checking.getVarone());
        checking.addTwo();
        System.out.println("*********************88");
        ScopeCheck.InnerClass name=checking.new InnerClass();
        name.addTwo();

    }
}
