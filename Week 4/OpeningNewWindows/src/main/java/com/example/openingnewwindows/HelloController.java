package com.example.openingnewwindows;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;

public class HelloController {

    private HelloApplication application;

    public HelloController(HelloApplication helloApplication) {
        this.application = helloApplication;
    }

    public void onUser1ButtonClick(ActionEvent event){
        System.out.println("Geklikt op button 1");
        try {
            application.openScreen2("Button 1");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void onUser2ButtonClick(ActionEvent event){
        System.out.println("Geklikt op button 2");
        try {
            application.openScreen2("Button 2");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}