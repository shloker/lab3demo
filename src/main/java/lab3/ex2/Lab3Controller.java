package lab3.ex2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Lab3Controller {

    @FXML
    private Label label1;

    @FXML
    private Button button1;
    
    @FXML
    private TextField textfieldcontrol1;

    @FXML
    void buttonPressed(ActionEvent event) {
    	label1.setText("Welcome to Java FX");
    	textfieldcontrol1.getText();
    	textfieldcontrol1.setText("Welcome to Java FX");
    }

}
