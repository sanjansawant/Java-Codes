/*
package com.company;

import org.omg.SendingContext.RunTime;

import java.util.function.Consumer;
import java.util.function.Supplier;

*/
/**
 * Created by sanja on 3/27/2017.
 *//*

import java.util.concurrent.*;
public class Threading extends RecursiveTask<long> {

    int low, high;
    int[] array;

    Threading(int[] arr,int lo, int hi){
        array=arr;
        low=lo;
        high=hi;
    }

    public long process(){

        if(high-low<=4){
            long sum=0;
            for(int i=low;i<high;++i){
                sum+=array[i];

            }
            return sum;
        }else{
                int mid=low+(high-low)/2;
                Threading left=new Threading(array,low,mid);
                Threading right=new Threading(array,mid,high);
                left.fork();
                long rightyAns=right.process();
                long leftAns=left.join();
                return leftAns;
            }
    }

    static long sumArray(int[] array){
        return new ForkJoinPool().invoke(new Threading(array,0,array.length));
    }


}
*/
