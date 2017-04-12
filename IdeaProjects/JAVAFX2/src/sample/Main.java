package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        // GridPane root=new GridPane();
        //root.setAlignment(Pos.CENTER);
        //root.setHgap(10);
        //root.setVgap(10);
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        //Label greeting=new Label("WELCOME TO JAVAFX!");
       /* greeting.setFont(Font.font("Times New Roman", FontWeight.BOLD,70));
        greeting.setTextFill(javafx.scene.paint.Color.GREEN);
        root.getChildren().add(greeting);
        primaryStage.setScene(new Scene(root, 300, 275));*/
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
