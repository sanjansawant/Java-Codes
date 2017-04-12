package com.sanjan.algorithms;

public class Main {

    private static StockListClass stockListClass=new StockListClass();
    public static void main(String[] args) {
        StockItem temp=new StockItem("bread",0.86,100);
        stockListClass.addStock(temp);

        temp=new StockItem("cake",1.10,7);
        stockListClass.addStock(temp);

        temp=new StockItem("car",12.50,2);
        stockListClass.addStock(temp);
        temp=new StockItem("chair",62.0,10);
        stockListClass.addStock(temp);
        temp=new StockItem("door",72.95,4);
        stockListClass.addStock(temp);
        temp=new StockItem("cup",0.50,200);
        stockListClass.addStock(temp);
        temp=new StockItem("door",72.95,4);
        stockListClass.addStock(temp);

        temp=new StockItem("juice",2.50,36);
        stockListClass.addStock(temp);

        temp=new StockItem("phone",96.99,35);
        stockListClass.addStock(temp);
        temp=new StockItem("towel",2.40,80);
        stockListClass.addStock(temp);

        temp=new StockItem("vase",8.76,40);
        stockListClass.addStock(temp);
        System.out.println(stockListClass);
        System.out.println("========");
        for(String s:stockListClass.getList().keySet()){

            System.out.println(s);


        }
    }
}
