package com.example.huistaak_webshop;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.io.IOException;

public class BestelConfController {

    private final Application app;
    private final Winkelmand gekochteBoeken;
    private final BoekenWinkelModel model;
    private final BestelBeleid prijzenBerekening;
    private final String naam;
    private final String adres;
    private final String telefoonnummer;

    public BestelConfController(Application application, BoekenWinkelModel model, String naam, String adres, String telefoonnummer) {
        this.app = application;
        this.model = model;
        this.prijzenBerekening = model.getPrijsBerekening();
        this.gekochteBoeken = model.getWinkelmand();
        this.naam = naam;
        this.adres = adres;
        this.telefoonnummer = telefoonnummer;
    }


    @FXML
    private ListView<String> productListView;
    @FXML
    private Label prijsProducten;
    @FXML
    private Label prijsVerzending;
    @FXML
    private Label prijsTotaal;
    @FXML
    private Label klantGegevens;
    @FXML
    private Label verwachteLevertijd;

    public void load() {
        // Toon de gekochte producten in de ListView
        for(Boek b: gekochteBoeken.getBoeken()) {
            productListView.getItems().add(b.toString());
        }

        // Vraag prijzen aan het model
        double prijsProducten = prijzenBerekening.berekenProductenPrijs(gekochteBoeken);
        double verzendPrijs = prijzenBerekening.berekenVerzendPrijs(gekochteBoeken);
        double totaalPrijs = prijzenBerekening.berekenTotaalPrijs(gekochteBoeken);

        // Toon het prijsoverzicht
        this.prijsProducten.setText(String.format("%.2f euro", prijsProducten));
        this.prijsVerzending.setText(String.format("%.2f euro", verzendPrijs));
        this.prijsTotaal.setText(String.format("%.2f euro", totaalPrijs));

        // Toon de klantgegevens
        String klantText = String.format("Naam: %s%n", naam);
        klantText += String.format("Adres: %s", adres);
        klantGegevens.setText(klantText);

        this.verwachteLevertijd.setText(String.format("Verwachte levertijd: %d dagen", prijzenBerekening.bepaalWachtTermijn(gekochteBoeken)));
    }


    @FXML
    private void herstart(ActionEvent event){
        try {
            model.nieuweBestelling();
            app.openMainScreen();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
