package com.example.openingnewwindows;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ResultController {

    @FXML
    private Label welcomeText;
    private HelloApplication application;

    public ResultController(HelloApplication helloApplication) {
        this.application = helloApplication;
    }

    public void setText(String textToShow) {
            welcomeText.setText(textToShow);
    }
}
