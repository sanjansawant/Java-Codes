package com.Sanjan;
import java.util.*;
public class Main {

    public static void main(String[] args) {

        Dog dog=new Dog("yanky");
        dog.eat();
        dog.breathe();


        Parrot parrot=new Parrot("kabutar");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        Penguin penguin=new Penguin("emperor");
        penguin.fly();

    }


}
