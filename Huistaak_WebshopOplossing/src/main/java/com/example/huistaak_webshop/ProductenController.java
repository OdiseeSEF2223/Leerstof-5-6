package com.example.huistaak_webshop;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

import java.io.IOException;

public class ProductenController {


    @FXML
    private GridPane producten;
    @FXML
    private ListView<String> productListView;

    @FXML
    private Label totaalPrijs;

    // Verwijzing naar de applicatie en de winkelmand
    private final Application app;
    private final BoekenWinkelModel boekenWinkelModel;
    private final Winkelmand winkelmand;

    public ProductenController(Application application) {
        this.app = application;
        boekenWinkelModel= app.boekenWinkel;
        winkelmand = app.boekenWinkel.getWinkelmand();
    }

    @FXML
    private void addToCart(javafx.event.ActionEvent event) {
        final Button clickedButton = (Button) event.getSource();
        final int columnIndex = GridPane.getColumnIndex(clickedButton);
        final int rowIndex = GridPane.getRowIndex(clickedButton);
        final int index = columnIndex + (rowIndex * 3); // 3 is het aantal kolommen in het grid
        // model aanpassen
        final Boek toeTeVoegenBoek = boekenWinkelModel.getBoek(index);
        winkelmand.toeVoegen(toeTeVoegenBoek);
        // Aanpassen view door toevoegen Boek. Ook mogelijk: listView opnieuw opbouwen ahv inhoud winkelmand
        productListView.getItems().add(toeTeVoegenBoek.toString());
        //  totaalprijs aanpassen
        totaalPrijs.setText(String.valueOf(boekenWinkelModel.getPrijsBerekening().berekenProductenPrijs(winkelmand)));
    }


    @FXML
    private void bestel() {
        // Open een ander scherm voor orderinformatie
        try {
            app.openBestelInformation(winkelmand);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}