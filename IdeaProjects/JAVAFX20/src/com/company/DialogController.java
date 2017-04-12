package com.company;

import com.company.dataModel.ToDoData;
import com.company.dataModel.TodoItem;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;


/**
 * Created by sanja on 2/23/2017.
 */
public class DialogController {
    @FXML
    private TextField textField;

    @FXML
    private TextArea textArea;

    @FXML
    private DatePicker datePicker;


    public TodoItem processData(){

        String s=textField.getText();
        String s1=textArea.getText();
        LocalDate date= datePicker.getValue();

        TodoItem todoItem=new TodoItem(s,s1,date);
        ToDoData.getInstance().addToDoItem(todoItem);
        return todoItem;

    }

}
