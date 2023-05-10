package com.example.geheledeling;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

/**
 * Klasse om een gehele deling te doen
 */
public class GeheleDelingController {

    @FXML
    public TextField txtX;
    @FXML
    public TextField txtY;
    @FXML
    public TextField txtResult;

    private GeheleDeling deler = new GeheleDeling();

    @FXML
    public void bereken(ActionEvent actionEvent) {
        double x = Double.parseDouble(txtX.getText());
        double y = Double.parseDouble(txtY.getText());

        int result = deler.bereken(x, y); // delen maar alles achter de komma weg

        txtResult.setText("" + result);
    }
}
