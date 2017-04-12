package com.company; /**
 * Created by sanja on 1/31/2017.
 */

import java.util.*;

public class Basket {
    Map<StockItem, Integer> basket;
    private String name;
    public boolean checkOut = false;

    public Basket(String name) {
        this.name = name;
        this.basket = new TreeMap<>();
    }




    public boolean addToBasket(StockItem item, int quantity) {


        if (item != null && quantity > 0) {

            if (basket.get(item) != null) {
                int number = basket.get(item);
                int newNumber = number + quantity;
                basket.put(item, newNumber);
            } else {
                basket.put(item, quantity);
            }
            return true;
        } else {

            System.out.println("cannot be put in to basket");
            return false;
        }

    }

    public Map<StockItem, Integer> getBasket() {
        return new HashMap<>(this.basket);
    }

    @Override
    public String toString() {
        System.out.println("=======Basket========");
        double basketPrice = 0;
        for (Map.Entry<StockItem, Integer> s : basket.entrySet()) {

            double totalCost = s.getValue() * s.getKey().getPrice();
            System.out.println(s.getKey().getName() + "  quantity  " + s.getValue());
            System.out.println(" " + totalCost);
            basketPrice += totalCost;
        }
        return "" + basketPrice;
    }
}
