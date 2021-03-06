package com.sanjan.algorithms;

import java.util.*;

/**
 * Created by sanja on 2/8/2017.
 */

public class StockList {

    private Map<String,StockItem> stocks;

    public StockList() {
        this.stocks=new LinkedHashMap<>();
    }


    public boolean addStock(StockItem item){
        if(item!=null){

            if(stocks.get(item.getName())!=null){

                StockItem itemAdjust=stocks.get(item.getName());
                int quantity=item.getQuantity()+itemAdjust.getQuantity();
                itemAdjust.adjustQuantity(quantity);
                //stocks.put(item.getName(),item);//?
            }else{
                System.out.println("Added new item");
                stocks.put(item.getName(),item);

            }
            return true;

        }else{
            return false;
        }

    }

    public int reserveStock(String item,int quantity){


        StockItem itemNew=stocks.get(item);
        if(itemNew!=null && quantity>0){

            return itemNew.reserve(quantity);
        }else{
            return 0;
        }

    }


    public int unreserveStock(String item,int quantity){

        StockItem itemNew=stocks.get(item);
        if(itemNew!=null && quantity>0){

            return itemNew.unreserve(quantity);
        }else{
            return 0;
        }





    }





    public boolean sellStock(String item,int quantity){

        if(item!=null && quantity >0){


            if(stocks.get(item)!=null){

                StockItem getItem=stocks.get(item);
                if(getItem.getQuantity()>=quantity) {

                    getItem.finaliseStock(-quantity);
                    return true;

                }else{
                    System.out.println(quantity+" not in stock");
                    return false;
                }
                //stocks.put(getItem.getName(),getItem);

            }else{

                System.out.println("StockItem not in the list");
                return false;
            }
        }else{

            System.out.println("error removing stock");
            return false;

        }
    }

    public  Map<String,Double> getPrices(){

        Map<String,Double> items=new LinkedHashMap<>();

        for(Map.Entry<String,StockItem> item:stocks.entrySet()){

            items.put(item.getKey(),item.getValue().getPrice());

        }

        return Collections.unmodifiableMap(items);

    }

    public Map<String, StockItem> getStocks() {
        return Collections.unmodifiableMap(this.stocks);
    }

    @Override
    public String toString() {


        double stockCost=0;
        for(Map.Entry<String,StockItem> s:stocks.entrySet()){
            double totalCost=0;
            totalCost+=s.getValue().getQuantity()*s.getValue().getPrice();

            System.out.print(s.getValue());
            System.out.println("  "+String.format("%.2f",totalCost));
            stockCost+=totalCost;

        }
        return " stockCost "+ String.format("%.2f",stockCost);

    }

    public StockItem getName(String name){
        return stocks.get(name);


    }
}
