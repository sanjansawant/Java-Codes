package com.company.dataModel;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 * Created by sanja on 2/23/2017.
 */
public class ToDoData {
    private static ToDoData instance=new ToDoData();
    private static String filename="ToDoListItems.txt";
    private static DateTimeFormatter dff;
    private ObservableList<TodoItem> toDoItems;

    private ToDoData(){

        dff=DateTimeFormatter.ofPattern("dd-MM-yyyy");


    }

    public static ToDoData getInstance(){
        return instance;

    }

    public void addToDoItem(TodoItem item){
        toDoItems.add(item);

    }

    public ObservableList<TodoItem> getToDoItems() {
        return toDoItems;
    }

   /* public void setToDoItems(List<TodoItem> toDoItems) {
        this.toDoItems = toDoItems;
    }*/

    public void loadToDoItems() throws IOException{
        toDoItems= FXCollections.observableArrayList();
        BufferedReader br=new BufferedReader(new FileReader(filename));
        String input;
        try{

            while((input=br.readLine())!=null){

                String[] array=input.split("\t");
                String shortDescription=array[0];
                String details=array[1];
                String deadLine=array[2];
                LocalDate date=LocalDate.parse(deadLine,dff);
                TodoItem item=new TodoItem(shortDescription,details,date);
                toDoItems.add(item);
            }
        }finally{

            if(br!=null){

                br.close();
            }

        }
    }


    public void storeToDoItems() throws IOException{

        BufferedWriter bf=new BufferedWriter(new FileWriter(filename));
        try{
            Iterator<TodoItem> iter=toDoItems.iterator();

            while(iter.hasNext()){

                TodoItem item=iter.next();
                bf.write(String.format("%s\t%s\t%s",item.getShortDescription(),item.getDetails(),item.getDeadline().format(dff)));

                bf.newLine();
            }




        }finally{
            if(bf!=null){
                bf.close();
            }

        }
    }


    public void deleteToDoItem(TodoItem item){

        toDoItems.remove(item);

    }

}
