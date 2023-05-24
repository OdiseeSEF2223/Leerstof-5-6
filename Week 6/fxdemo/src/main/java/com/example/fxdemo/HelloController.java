package com.example.fxdemo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController implements ILoadable{
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void load(){

    }

    public void save(IDatabase database){

    }
}