package com.Sanjan.practice;

import com.Sanjan.practice.DataModel.ToDoItem;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Controller {
    private List<ToDoItem> listView;

    @FXML
    private ListView<ToDoItem> myListView;
    @FXML
    private TextArea myTextArea;
    @FXML
    private Label getDate;

    @FXML
    public void initialize(){


        ToDoItem item1=new ToDoItem("Job","Need a job", LocalDate.of(2017, Month.MARCH,31));
        ToDoItem item2=new ToDoItem("Home","will go to india",LocalDate.of(2017,Month.DECEMBER,20));
        ToDoItem item3=new ToDoItem("Car","will drive maruti swift",LocalDate.of(2018,Month.JANUARY,05));
        ToDoItem item4=new ToDoItem("Shashank","visit shashank home",LocalDate.of(2018,Month.JANUARY,10));
        ToDoItem item5=new ToDoItem("USa","Time for return",LocalDate.of(2018,Month.JANUARY,20));
        listView=new ArrayList<>();
        listView.add(item1);
        listView.add(item2);
        listView.add(item3);
        listView.add(item4);
        listView.add(item5);

        myListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<ToDoItem>() {
            @Override
            public void changed(ObservableValue<? extends ToDoItem> observable, ToDoItem oldValue, ToDoItem newValue) {

                if(newValue!=null){
                    ToDoItem item=myListView.getSelectionModel().getSelectedItem();
                    System.out.println(item.getDescription()+" "+item.getDf());
                    myTextArea.setText(item.getDescription());

                    DateTimeFormatter dff=DateTimeFormatter.ofPattern("MMMM Y DD");
                    getDate.setText(dff.format(item.getDf()));



                }

            }
        });

        myListView.getItems().setAll(listView);
        myListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        myListView.getSelectionModel().selectFirst();


    }

    @FXML
    public void display(){


    }

}
