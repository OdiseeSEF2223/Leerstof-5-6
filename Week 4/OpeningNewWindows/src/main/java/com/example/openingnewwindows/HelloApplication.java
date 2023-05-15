package com.example.openingnewwindows;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    private Stage stage;

    // Als we willen werken met verschillende schermen, dan moet er typisch data van de ene controller naar de andere doorgegeven worden
    // Dit gaat niet met het huidige systeem omdat de controller verborgen zit voor ons
    // We moeten dus zelf de controller aanmaken en dan kunnen we data doorgeven
    // maak dus twee fxml files aan en verwijder de fx:controller
    // maak in 1 scherm twee buttons (daar beginnnen we) en in het andere een label
    // Pas de code in start aan zodat je met de fxmlLoader de controller instelt (geef de applicatie mee)
    // de referentie naar de applicatie kunnen we dan gebruiken om nieuwe schermen te openen/data door te geven
    // dit wordt ook wel de coordinator genoemd

    // Data kan dan doorgegeven aangepast worden na het uitvoeren van de load
    // Hierbij is het bijvoorbeeld mogelijk om een model klasse mee te geven die alle data bevat

    // fx:controller in de fxml file weg
    // geef de application (this) mee aan de controller om schermen te openen
    // om een nieuw scherm te openen gebruik de setController zoals hieronder
    // geef de data mee en gebruik deze om de uit te tonen na de .load()
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
        fxmlLoader.setController(new HelloController(this));
        this.stage = stage;
        stage.setTitle("Scherm 1");
        stage.setScene(new Scene(fxmlLoader.load(), 300, 275));
        stage.show();
    }

    public void openScreen2(String textToShow) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("result-view.fxml"));
        ResultController controller = new ResultController(this);
        fxmlLoader.setController(controller);
        stage.setTitle("Scherm 2");
        stage.setScene(new Scene(fxmlLoader.load(), 300, 275));
        stage.show();

        controller.setText(textToShow);
    }

    public static void main(String[] args) {
        launch();
    }
}