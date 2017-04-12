package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;



public class Controller {
    @FXML
    private TextField fieldName;
    @FXML
    private Button helloButton;
    @FXML
    private Button byeButton;

    @FXML
    private CheckBox checked;
    @FXML
    private Label ourLabel;

    @FXML
    public void initialize(){

        helloButton.setDisable(true);
        byeButton.setDisable(true);
    }


    @FXML
    public void buttonPressed(ActionEvent e){

        if(e.getSource().equals(helloButton)){

            System.out.println("Hello "+fieldName.getText());
        }else if(e.getSource().equals(byeButton)){
            System.out.println("Hello "+fieldName.getText());
        }

        Runnable task=new Runnable(){
            @Override
            public void run() {
                try{
                    String s=Platform.isFxApplicationThread()?"UITHREAD":"BACKGROUND THREAD";
                    System.out.println("I am sleeping on "+s);

                    Thread.sleep(10000);
                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            String s=Platform.isFxApplicationThread()?"UITHREAD":"BACKGROUND THREAD";
                            System.out.println("I am updating on "+s);
                            ourLabel.setText("we did something");
                        }
                    });


                }catch(InterruptedException event){
                    //dont care

                }

            }
        };


        new Thread(task).start();

        if(checked.isSelected()){
            fieldName.clear();
            initialize();
        }
    }


    public void handsButton(){

        String text=fieldName.getText();
        boolean disabled=text.isEmpty()||text.trim().isEmpty();
        helloButton.setDisable(disabled);
        byeButton.setDisable(disabled);

    }

    @FXML
    public void handleClearing(){
        System.out.println("Check box is "+(checked.isSelected()?"checked":"notChecked"));
        boolean flag=checked.isSelected()?true:false;

    }


}
