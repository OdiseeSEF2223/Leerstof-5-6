package com.example.fxdemo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        System.out.println(bereken(5, 0));

        launch();
    }

    public static double bereken(double a, double b){
        try{
            return 5/0;
        }catch(ArithmeticException ioe){
        // het is niet altijd goed om alle exceptions op te vangen
        } catch (Exception e){
            System.out.println(e);
            return 0;
        } finally {

            System.out.println("test");
        }

        System.out.println("test");
        return 5;
    }

    // met het throws keyboard geef je aan welke exception mogelijk opgeworpen wordt
    public static double bereken2(double a, double b) throws ArithmeticException{
        double getal = 5/0;
        System.out.println("test");
        return getal;
    }

    public static double bereken3() throws ConnectionNotFoundException {
        throw new ConnectionNotFoundException();
    }
}