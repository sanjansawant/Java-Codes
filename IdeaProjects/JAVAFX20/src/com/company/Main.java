package com.company;

import com.company.dataModel.ToDoData;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("mainwindow.fxml"));
        primaryStage.setTitle("Todo List");
        primaryStage.setScene(new Scene(root, 900, 500));
        primaryStage.show();
    }


    @Override
    public void stop() throws Exception {
        try{

            ToDoData.getInstance().storeToDoItems();

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }


    @Override
    public void init() throws Exception {
        try{

            ToDoData.getInstance().loadToDoItems();

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        
        launch(args);
    }
}
