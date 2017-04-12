package com.sanjan.algorithms;
import java.util.*;
public class Main {
    private static StockList stockList =new StockList();
    private static Basket basket=new Basket("Sanjan");
    public static void main(String[] args) {
        StockItem temp=new StockItem("bread",0.86,100);
        stockList.addStock(temp);

        temp=new StockItem("cake",1.10,7);
        stockList.addStock(temp);

        temp=new StockItem("car",12.50,2);
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
        System.out.println(stockList.sellStock("door",4));

        System.out.println(stockList);
        System.out.println("========================");

        Basket sanjan=new Basket("Sanjan");
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

        sellStock(sanjan,"bread",1);
        System.out.println("=========================");
        System.out.println(sanjan);
        System.out.println("======================");
        System.out.println(stockList);

        /*temp=new StockItem("pen",1.12);
        stockList.getList().put(temp.getName(),temp);*/
        stockList.getList().get("car").adjustQuantityInStock(2000);
        stockList.get("car").adjustQuantityInStock(2000);
        System.out.println(stockList);

        for(Map.Entry<String,Double> price:stockList.getPrices().entrySet()){

            System.out.println(price.getKey()+" cost "+price.getValue());

        }


    }



    public static int sellStock(Basket basket,String item,int quantity){

        StockItem stockItem=stockList.getList().get(item);
        if(stockItem==null){
            System.out.println("We dont sell "+item);
            return 0;
        }

        if(stockList.sellStock(item,quantity)!=0){
            basket.addInBasket(stockItem,quantity);
            return quantity;
        }
        return 0;

    }
}
