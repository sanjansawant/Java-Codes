package com.sanjan.algorithms;

/**
 * Created by sanja on 1/23/2017.
 */
import java.util.*;
public class StockListClass {

    private final Map<String,StockItem> list;

    public StockListClass() {
        this.list=new LinkedHashMap<>();
    }

    public int addStock(StockItem item){
        if(item!=null){
            StockItem inStock=list.getOrDefault(item.getName(),item);

            if(inStock!=item){

                item.adjustStock(inStock.quantityInStock());
            }
            list.put(item.getName(),item);

            return item.quantityInStock();
        }
       return 0;
    }

    public int sellStock(String item,int quantity){

        StockItem inStock=list.getOrDefault(item,null);
        if(inStock!=null && inStock.quantityInStock()>quantity && quantity>0){

            inStock.adjustStock(-quantity);
            return quantity;
        }
        return 0;
    }

    public Map<String, StockItem> getList() {
        return Collections.unmodifiableMap(list);
    }

    public StockItem get(String key){
        return list.get(key);

    }


    @Override
    public String toString() {
        String s="\n StockList \n";
        double totalCost=0.0;

        for(String item:list.keySet()){

            StockItem stockitem=list.get(item);
            double itemValue=stockitem.getPrice()*stockitem.quantityInStock();
            s=s+stockitem.getName()+", There are "+stockitem.quantityInStock()+", and total price is= "+String.format("%.2f",itemValue);
            s+="\n";
            totalCost+=itemValue;
        }
        return s+"total stock value "+totalCost;
    }
}
