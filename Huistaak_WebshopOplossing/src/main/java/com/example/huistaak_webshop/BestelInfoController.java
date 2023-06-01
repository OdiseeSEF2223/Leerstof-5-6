package com.example.huistaak_webshop;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.ArrayList;

public class BestelInfoController {
    @FXML
    private Label prijsProducten;
    @FXML
    private Label prijsVerzending;
    @FXML
    private Label prijsTotaal;
    @FXML
    private TextField nameTextField;
    @FXML
    private TextField addressTextField;
    @FXML
    private TextField phoneNumberTextField;

    private final Winkelmand gekochteBoeken;
    private final Application app;
    private final BoekenWinkelModel model;

    //TODO vermits we de winkelmand bewaren in het model kunnen we deze parameter afschaffen.
    public BestelInfoController(Application application, BoekenWinkelModel model, Winkelmand gekochteBoeken) {
        this.model = model;
        this.gekochteBoeken = gekochteBoeken;
        this.app = application;
    }

    public void load() {
        double prijsProducten = model.getPrijsBerekening().berekenProductenPrijs(gekochteBoeken);
        double verzendPrijs = model.getPrijsBerekening().berekenVerzendPrijs(gekochteBoeken);
        double totaalPrijs = model.getPrijsBerekening().berekenTotaalPrijs(gekochteBoeken);

        this.prijsProducten.setText(String.format("%.2f euro", prijsProducten));
        this.prijsVerzending.setText(String.format("%.2f euro", verzendPrijs));
        this.prijsTotaal.setText(String.format("%.2f euro", totaalPrijs));
    }

    @FXML
    private void bestel(ActionEvent event) {
        String naam = nameTextField.getText();
        String adres = addressTextField.getText();
        String telefoonnummer = phoneNumberTextField.getText();

        // Roep de bestelfunctie aan in de Application-klasse
        try {
            app.openOrderConfirmation(gekochteBoeken, naam, adres, telefoonnummer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
