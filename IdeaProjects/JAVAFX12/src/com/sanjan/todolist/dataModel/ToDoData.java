package com.sanjan.todolist.dataModel;
import java.util.*;
import java.time.format.DateTimeFormatter;

/**
 * Created by sanja on 2/12/2017.
 */
public class ToDoData {
    private static ToDoData instance=new ToDoData();
    private static DateTimeFormatter dff;
    private List<ToDoItem> toDoItems;


    private ToDoData(){
        dff=DateTimeFormatter.ofPattern("dd-MM-YYYY");

    }

    public static ToDoData getInstance() {
        return instance;
    }


    public List<ToDoItem> getToDoitems() {
        return toDoItems;
    }

    public void setToDoItems(List<ToDoItem> toDoItems) {
        this.toDoItems = toDoItems;
    }


}
