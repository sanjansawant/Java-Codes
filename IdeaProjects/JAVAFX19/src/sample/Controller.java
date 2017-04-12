package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    private Label labelid;


    @FXML
    public void handleKey(){
        labelid.setText("Ok button pressed");
    }
}
