package com.sanjan.algorithms;

/**
 * Created by sanja on 1/23/2017.
 */
public class StockItem implements Comparable<StockItem> {

    private final String name;
    private final double price;
    private int quantityInStock;

    public StockItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantityInStock=0;
    }

    public StockItem(String name, double price, int quantityInStock) {
        this.name = name;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }


    public void adjustQuantityInStock(int quantity){
        int newQuantity=this.quantityInStock+quantity;
        if(newQuantity>=0){
            this.quantityInStock=newQuantity;
        }
    }

    @Override
    public boolean equals(Object obj){
        System.out.println("Entering StockItem.equals");
        if(this==obj){
            return true;
        }
        if(obj==null||(this.getClass() !=obj.getClass())){
            return false;
        }
        String name1=(((StockItem)obj).getName());
        return this.name.equals(name1);

    }

    @Override
    public int hashCode(){
        return this.name.hashCode()+31;
    }

    @Override
    public int compareTo(StockItem item) {

        System.out.println("Entering StockItem.compareTo");

        return this.name.compareTo(item.getName());
    }

    @Override
    public String toString() {
        return "StockItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantityInStock=" + quantityInStock +
                '}';
    }


}
