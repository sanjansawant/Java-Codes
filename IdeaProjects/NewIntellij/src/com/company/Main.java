package com.company;
import java.time.Month;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;
import java.util.*;
public class Main {

    public static void main(String[] args) {

        Animal animal=new Animal(4);
        Dog dog=new Dog(3);
        Animal doggy=new Dog(4);
        doggy.move();
        dog.eat();
        animal.move();
    }

}

