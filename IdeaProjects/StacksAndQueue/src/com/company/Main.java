package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here

        Stack<Integer> stack=new Stack<>();


        for(int i=1;i<=10;i++){

            stack.push(i);

        }

        System.out.println(stack);

        System.out.println(stack.get(5));
        stack.remove(5);
        System.out.println(stack);
/*
        ListIterator<Integer> move=stack.listIterator();

        while(move.hasNext()){

            System.out.println(move.next());
        }
        while(!stack.empty()){

            System.out.println("popped ==> "+stack.pop());

        }
        System.out.println(stack.size());*/

        System.out.println("LEARNING QUEUE");

        Queue<Integer> queue=new LinkedList<>();

        for(int i=0;i<=10;i++){

            queue.offer(i);
        }

        Iterator<Integer> nums=queue.iterator();

        while(nums.hasNext()){
            System.out.println(nums.next());
        }

        System.out.println("LEARNING PRIORITY QUEUE");

        PriorityQueue<String> names=new PriorityQueue<>();
        names.add("sanjan");
        names.add("niranjan");
        names.add("anupama");
        names.add("harihar");
        names.add("siddhesh");
        names.offer("shubhashree");

        System.out.println(names);

        Iterator<String> iterator=names.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        names.poll();
        System.out.println(names);

    }
}
