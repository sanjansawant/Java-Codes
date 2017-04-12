package com.sanjan.algorithms;
import java.util.*;
/**
 * Created by sanja on 1/23/2017.
 */
public class Basket {

    private final String name;
    private Map<StockItem,Integer> basket1;

    public Basket(String name) {
        this.name = name;
        this.basket1=new TreeMap<>();
    }

    public void addInBasket(StockItem item,int quantity){



        if(item!=null && quantity>0){
            int previous=basket1.getOrDefault(item,0);
            int newQuantity=previous+quantity;
            basket1.put(item,newQuantity);
        }
        //basket1.put(item,quantity);

    }

    public void removeFromBasket(StockItem item,int quantity){

        int number=basket1.getOrDefault(item,0);


        if(number!=0&&(number-quantity)>=0){
            System.out.println("here");

            basket1.put(item,number-quantity);

        }
        System.out.println("Maths error");

    }


    public String getName() {
        return name;
    }

    public Map<StockItem, Integer> getBasket() {
        return Collections.unmodifiableMap(basket1);
    }

    @Override
    public String toString() {
        String s="\n STOCKLIST in basket \n";
        s+=this.name+" contains "+basket1.size()+((basket1.size()==1)?" item\n":" items\n");
        double totalCost=0.0;
        for(Map.Entry<StockItem,Integer> item: basket1.entrySet()){

           double price=item.getValue()*item.getKey().getPrice();
           s=s+""+item.getKey().getName()+" : "+item.getKey().getPrice()+
                   " total price "+price+" "+item.getValue()+" purchased\n";
           totalCost+=price;
        }
        return s+" Total cost is "+totalCost;
    }

}
