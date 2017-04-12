package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

;

public class Controller {
    @FXML
    private TextField nameField;
    @FXML
    private Button helloButton;
    @FXML
    private Button byeButton;


    @FXML
    public void initialize(){
        helloButton.setDisable(true);
        byeButton.setDisable(true);
    }


    @FXML
    public void onButtonClicked2(ActionEvent e){

        if(e.getSource().equals(helloButton)){
            System.out.println("Hello, "+nameField.getText());
            System.out.println("This button was clicked "+e.getSource());
        }else if(e.getSource().equals(byeButton)){
            System.out.println("Bye, "+nameField.getText());
            System.out.println("This button was clicked "+e.getSource());
        }
    }


    public void handleKey(){

        String text=nameField.getText();
        boolean disabledButton=text.isEmpty()|| text.trim().isEmpty();
        helloButton.setDisable(disabledButton);
        byeButton.setDisable(disabledButton);

    }

}
