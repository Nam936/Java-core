package com.example.exercises_javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {
    public TextField txt_username;
    public PasswordField txt_password;
    public Button bt_login;
    public Label lb_mess;
    public Label lb_mess1;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void OncCickLogin(ActionEvent actionEvent) {
        String user_check = "name023";
        String password_check = "123456";
        String user = txt_username.getText();
        String password = txt_password.getText();


         if (user.equals(user_check) && password.equals(password_check)){
             lb_mess.setVisible(true);
         }
         else if (user.equals(user_check) || password.equals(password_check)){
             lb_mess1.setVisible(true);
         }



    }
}