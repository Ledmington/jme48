package jme48;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.text.Text;

import java.util.logging.Logger;

public class LoginController {

    private final Logger logger = Logger.getGlobal();

    @FXML public PasswordField passwordField;
    @FXML private Text actiontarget;
    
    @FXML protected void handleSubmitButtonAction(ActionEvent event) {
        logger.info("Clicked submit");
        actiontarget.setText("Sign in button pressed");
        logger.info(String.valueOf(event));
    }
}