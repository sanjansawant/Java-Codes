package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.GridPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.FileChooser;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.*;
import java.io.File;
import java.util.List;

public class Controller {

    @FXML
    private Label myLabel;
    @FXML
    private Button button4;

    @FXML
    private GridPane gridPane;
    @FXML
    private WebView webView;

    @FXML
    public void initialize(){
        /*myLabel.setScaleX(2.0);
        myLabel.setScaleY(2.0);*/
        button4.setEffect(new DropShadow());
    }

    @FXML
    public void handleEntry(){
        myLabel.setScaleX(2.0);
        myLabel.setScaleY(2.0);
    }
    @FXML
    public void handleExit(){
        myLabel.setScaleX(1.0);
        myLabel.setScaleY(1.0);
    }
    @FXML
    public void handleClick(){

        FileChooser chooser=new FileChooser();
        chooser.setTitle("Save Application File");
        chooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Text","*.txt"),
                new FileChooser.ExtensionFilter("PDF","*.pdf"),
                new FileChooser.ExtensionFilter("All files","*.*")
        );
        List<File> file=chooser.showOpenMultipleDialog(gridPane.getScene().getWindow());
        if(file!=null) {
            for(File filea:file) {
                System.out.println(filea.getPath());
            }
        }else{
            System.out.println("was cancelled midway");
        }
    }

    @FXML
    public void handleLinkClick(){
        /*try {
            Desktop.getDesktop().browse(new URI("http://www.javafx.com"));


        }catch(IOException e){
            e.printStackTrace();
        }catch(URISyntaxException e){
            e.printStackTrace();
        }*/

        WebEngine engine=webView.getEngine();
        engine.load("http://www.javafx.com");
    }


}
