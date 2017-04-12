package com.sanjan.algorithms;

import java.util.*;
/**
 * Created by sanja on 1/23/2017.
 */
public class StockList {

    private Map<String,StockItem> list;

    public StockList() {
        this.list=new LinkedHashMap<>();
    }

    public void addStock(StockItem item){
        StockItem previous=list.getOrDefault(item.getName(),item);
        //StockItem previous1=list.get(item.getName());
        if(previous!=item){
            previous.adjustQuantityInStock(item.getQuantityInStock());
        }
        list.put(previous.getName(),previous);
    }

    public int sellStock(String item, int quantity){
        StockItem previous=list.getOrDefault(item,null);

        if (quantity > 0 && previous != null && (previous.getQuantityInStock() - quantity >= 0)) {

            previous.adjustQuantityInStock(-quantity);
            return quantity;
        }
        return 0;


    }


    public Map<String,Double> getPrices(){

        Map<String,Double> prices=new LinkedHashMap<>();
        for(Map.Entry<String,StockItem> item:list.entrySet()){

            prices.put(item.getKey(),item.getValue().getPrice());

        }
        return Collections.unmodifiableMap(prices);

    }


    public Map<String, StockItem> getList() {
        return Collections.unmodifiableMap(list);
    }


    @Override
    public String toString() {
       String s="\n STOCKLIST \n";
       double totalCost=0.0;
       for(Map.Entry<String,StockItem> item: list.entrySet()){

           double price=item.getValue().getPrice()*item.getValue().getQuantityInStock();
           s=s+item.getKey()+", there are "+item.getValue().getQuantityInStock()+" &"+
                   " Total price is ";
           s=s+String.format("%.2f",(price))+"\n";
           totalCost+=price;

       }
        return s+" Total cost is "+totalCost;
    }

    public StockItem get(String name){

        return list.get(name);
    }
}
