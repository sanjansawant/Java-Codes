package com.company;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.*;
/**
 * Created by sanja on 1/30/2017.
 */
public class Main {
    private static StockList stockList=new StockList();

    public static void main(String[] args) {

        String timeStamp=new SimpleDateFormat("yyyy/MM/dd\nhh:mm:ss").format(Calendar.getInstance().getTime());
        System.out.println(timeStamp+ " Created by "+" sanjan");
        StockItem temp=new StockItem("bread",0.86,100);
        stockList.addStock(temp);

        temp=new StockItem("cake",1.10,7);
        stockList.addStock(temp);

        temp=new StockItem("car",12.50,3);
        stockList.addStock(temp);

        temp=new StockItem("chair",62.0,10);
        stockList.addStock(temp);

        temp=new StockItem("door",72.95,4);
        stockList.addStock(temp);

        temp=new StockItem("cup",0.50,200);
        stockList.addStock(temp);
        temp=new StockItem("cup",0.45,7);
        stockList.addStock(temp);

        temp=new StockItem("door",72.95,4);
        stockList.addStock(temp);

        temp=new StockItem("juice",2.50,36);
        stockList.addStock(temp);

        temp=new StockItem("phone",96.99,35);
        stockList.addStock(temp);

        temp=new StockItem("towel",2.40,80);
        stockList.addStock(temp);

        temp=new StockItem("vase",8.76,40);
        stockList.addStock(temp);


        System.out.println(stockList);

        System.out.println("==========removing door======");
        stockList.sellStock("door",1);
        System.out.println(stockList);
        System.out.println("==========removing door======");
        System.out.println(stockList.sellStock("door",8));
        System.out.println(stockList);

        System.out.println("Basket Time");


        Basket sanjan=new Basket("Sanjan");


        sellStock(sanjan,"car",1);
        System.out.println(sanjan);

        sellStock(sanjan,"car",1);
        System.out.println(sanjan);

        sellStock(sanjan,"car",1);
        System.out.println(sanjan);

        sellStock(sanjan,"car",1);
        System.out.println(sanjan);

        sellStock(sanjan,"spanner",5);
        System.out.println(sanjan);

        sellStock(sanjan,"juice",4);
        System.out.println(sanjan);

        sellStock(sanjan,"cup",12);
        System.out.println(sanjan);
        System.out.println("+++++++++++++++++++++++++++++++++");
        System.out.println(stockList);


        for(Map.Entry<String,Double> maps:stockList.getPrices().entrySet()){

            System.out.println(maps.getKey()+" cost "+maps.getValue());

        }

    }

    public static void sellStock(Basket basket, String item, int quantity){
        System.out.println("+++++++++++++++++++++++++++++");
        if(stockList.getName(item)!=null){

            StockItem itemNew=stockList.getName(item);
            int quantityLatest=itemNew.getQuantity();
            //System.out.println(quantityLatest);
            if(quantityLatest>0) {
                //System.out.println("here");
                basket.addToBasket(itemNew, quantity);
                stockList.sellStock(item, quantity);
            }else{

                System.out.println("cannot be added");
            }
        }else{
            System.out.println("item not in the stockList");
        }


    }

}
