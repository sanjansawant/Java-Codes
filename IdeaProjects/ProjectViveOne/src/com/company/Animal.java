package com.company;

/**
 * Created by sanja on 2/14/2017.
 */
public class Animal {


    private String legs;
    private int eyes;

    public Animal(String legs, int eyes) {
        this.legs = legs;
        this.eyes = eyes;
    }

    public String getLegs() {
        return legs;
    }

    public void setLegs(String legs) {
        this.legs = legs;
    }

    public int getEyes() {
        return eyes;
    }

    public static void setEyes(int eyes) {
        eyes = eyes;
        Dog dog=new Dog();
        dog.hello();
    }


    private static class Dog{



        public void hello(){
            System.out.println("hello");
            setEyes(3);

            String nir="Niranjan";
            String san=nir.substring(-3,-3);
            System.out.println(san);
        }

    }
}
