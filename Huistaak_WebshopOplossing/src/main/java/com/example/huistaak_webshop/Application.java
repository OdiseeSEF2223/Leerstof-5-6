package com.example.huistaak_webshop;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class Application extends javafx.application.Application {

    BoekenWinkelModel boekenWinkel=new BoekenWinkelModel();

    private Stage stage;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.stage = primaryStage;

        openMainScreen();
    }

    public void openMainScreen() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("product.fxml"));

        loader.setController(new ProductenController(this));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Webshop Application");
        stage.show();
    }

    public void openBestelInformation(Winkelmand gekochteBoeken) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("bestelInfo.fxml"));
        BestelInfoController ctrl = new BestelInfoController(this, boekenWinkel, gekochteBoeken);
        loader.setController(ctrl);
        Parent root = loader.load();
        ctrl.load();

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Webshop Application");
        stage.show();
    }

    public void openOrderConfirmation(Winkelmand gekochteBoeken, String naam, String adres, String telefoonnummer) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("bestelConf.fxml"));
        BestelConfController ctrl = new BestelConfController(this, boekenWinkel, naam, adres, telefoonnummer);
        loader.setController(ctrl);
        Parent root = loader.load();
        ctrl.load();

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Webshop Application");
        stage.show();
    }

}