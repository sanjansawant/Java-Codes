package com.sanjan.algorithms;

/**
 * Created by sanja on 1/25/2017.
 */
public class StockItem implements Comparable<StockItem> {

    private final String name;
    private final double price;
    private int quantityStock;

    public StockItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantityStock=0;
    }

    public StockItem(String name, double price, int quantityStock) {
        this.name = name;
        this.price = price;
        this.quantityStock = quantityStock;
    }


    @Override
    public int compareTo(StockItem item) {
        if (this == item) {
            return 0;
        }
        if (item != null) {
            return this.name.compareTo(item.getName());
        }
        throw new NullPointerException();
    }
    @Override
    public int hashCode(){

        return this.name.hashCode()+31;

    }

    @Override
    public boolean equals(Object obj){

        if(this==obj){
            return true;
        }
        if(obj ==null || obj.getClass()!=this.getClass()){

            return false;
        }

        String name1=(((StockItem)obj).getName());
        return this.name.equals(name1);
    }

    public int adjustQuantityInStock(int quantity){

        int newQuantity=quantityStock+quantity;
        if(newQuantity>=0){
            this.quantityStock=newQuantity;
            return quantity;

        }
        return 0;

    }



    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }



    @Override
    public String toString() {
        return "StockItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantityStock=" + quantityStock +
                '}';
    }
}
