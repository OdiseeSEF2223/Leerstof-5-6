package com.example.loginwindow;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class HelloController {

    @FXML
    private TextField txtUsername;
    @FXML
    private TextField txtPassword;

    @FXML
    public void loginUser(ActionEvent actionEvent) {

        // LET OP tekst vergelijken doe je best met equals
        // Dit komt omdat elke string een object is en  == met objecten vergelijkt de referentie (adres van het object)
        if(txtUsername.getText().equals("Jens") && txtPassword.getText().equals("Jens")) {
            System.out.println("logged in");
        } else {
            System.out.println("could not logged in");
        }
    }

    @FXML
    public void cancelLogin(ActionEvent actionEvent) {
        txtUsername.setText("");
        txtPassword.setText("");
    }
}