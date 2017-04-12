package com.company;

/**
 * Created by sanja on 3/27/2017.
 */
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.ExecutionException;


public class PersonTest {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("buffering");
        sb.replace(2,7,"BUFFER");
        sb.delete(2,4);
        String s=sb.substring(1,5);
        System.out.println(s);
    }


}
