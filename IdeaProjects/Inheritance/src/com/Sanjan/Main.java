package com.Sanjan;

public class Main {

    public static void main(String[] args) {
        Animal animal=new Animal(1,1,1,1,"animal");
        Dog puppy=new Dog(1,1,"puppy",1,1,1,1,"furry");
        puppy.eat();
        puppy.walk();
        puppy.run();
    }
}
