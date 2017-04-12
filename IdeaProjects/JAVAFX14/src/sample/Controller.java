package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.TextField;


public class Controller {
    @FXML
    private TextField ourTextField;
    @FXML
    private Button sayHello;
    @FXML
    private Button sayBye;

    @FXML
    private CheckBox clearEverything;
    @FXML
    private Label ThisIsLabel;

    @FXML
    public void initialize(){
        sayBye.setDisable(true);
        sayHello.setDisable(true);
    }

    @FXML
    public void keyPressed(ActionEvent e){

        if(e.getSource().equals(sayHello)) {
            System.out.println("Hello, "+ourTextField.getText());
        }else if(e.getSource().equals(sayBye)){
            System.out.println("Bye, "+ourTextField.getText());
        }

        Runnable task=new Runnable() {
            @Override
            public void run() {
                try {
                    String s=Platform.isFxApplicationThread()?"UI Thread":"BackGround Thread";
                    System.out.println(s);
                    Thread.sleep(10000);
                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            ThisIsLabel.setText("we did something");
                            String s=Platform.isFxApplicationThread()?"UI Thread":"BackGround Thread";
                            System.out.println(s);
                        }
                    });

                }catch(InterruptedException event){}
            }
        };

        new Thread(task).start();

        if(clearEverything.isSelected()){
            ourTextField.clear();
            sayBye.setDisable(true);
            sayHello.setDisable(true);
        }


    }

    @FXML
    public void handleKey(){
        String s=ourTextField.getText();
        boolean flag=s.isEmpty()||s.trim().isEmpty();
        sayHello.setDisable(flag);
        sayBye.setDisable(flag);
    }

}
