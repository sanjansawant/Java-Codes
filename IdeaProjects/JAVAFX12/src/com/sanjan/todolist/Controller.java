package com.sanjan.todolist;

import com.sanjan.todolist.dataModel.ToDoItem;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;

import java.time.LocalDate;
import java.time.Month;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<ToDoItem> toDoItem;
    @FXML
    private ListView<ToDoItem> toDoListView;
    @FXML
    private TextArea fillMyArea;
    @FXML
    private Label getDeadlinefrom;

    @FXML
    public void initialize(){
        ToDoItem item1=new ToDoItem("Job","Need a job", LocalDate.of(2017, Month.MARCH,31));
        ToDoItem item2=new ToDoItem("Home","will go to india",LocalDate.of(2017,Month.DECEMBER,20));
        ToDoItem item3=new ToDoItem("Car","will drive maruti swift",LocalDate.of(2018,Month.JANUARY,05));
        ToDoItem item4=new ToDoItem("Shashank","visit shashank home",LocalDate.of(2018,Month.JANUARY,10));
        ToDoItem item5=new ToDoItem("USa","Time for return",LocalDate.of(2018,Month.JANUARY,20));
        toDoItem=new ArrayList<>();

        toDoItem.add(item1);
        toDoItem.add(item2);
        toDoItem.add(item3);
        toDoItem.add(item4);
        toDoItem.add(item5);

        toDoListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<ToDoItem>() {
            @Override
            public void changed(ObservableValue<? extends ToDoItem> observable, ToDoItem oldValue, ToDoItem newValue) {
                if(newValue!=null) {
                    ToDoItem item = toDoListView.getSelectionModel().getSelectedItem();
                    fillMyArea.setText(item.getDescription());
                    DateTimeFormatter df=DateTimeFormatter.ofPattern("MMMM d,yyyy");

                    getDeadlinefrom.setText(df.format(item.getDeadline()));

                }

            }
        });

        toDoListView.getItems().setAll(toDoItem);

        toDoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        toDoListView.getSelectionModel().selectFirst();
    }

    public void handleKey(){
        ToDoItem item=toDoListView.getSelectionModel().getSelectedItem();
        //System.out.println("Selected item is "+item);

        StringBuilder sb=new StringBuilder(item.getDescription());
        sb.append("\n\n\n\n");
        sb.append("DUE: ");
        fillMyArea.setText(sb.toString());


        getDeadlinefrom.setText(item.getDeadline().toString());

    }

}
