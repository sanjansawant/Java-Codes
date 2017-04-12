package com.sanjan.algorithms;

import java.util.*;
/**
 * Created by sanja on 1/23/2017.
 */
public class Basket {

    private final String name;
    private Map<StockItem,Integer> list;

    public Basket(String name) {
        this.name = name;
        this.list=new HashMap<>();
    }

    public int addToBasket(StockItem item,int quantity){
        if(item!=null&&quantity>0){

            int previous=list.getOrDefault(item,0);
            list.put(item,quantity+previous);
            return quantity+previous;
        }
        return 0;

    }

    public Map<StockItem, Integer> getList() {
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {

        String s="\n shopping basket "+name+" conatins "+list.size()+" items\n";
        double totalCost=0.0;
        for(Map.Entry<StockItem,Integer> item:list.entrySet()){
            s=item.getKey().getName()+" . "+item.getValue()+" purchased";
            totalCost=item.getKey().getPrice()*item.getValue();
        }
        return s+" totalCost = "+totalCost;

    }
}
