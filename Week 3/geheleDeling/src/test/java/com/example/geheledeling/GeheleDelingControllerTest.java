package com.example.geheledeling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeheleDelingControllerTest {

    @Test
    void bereken() {
        //Arrange
        GeheleDelingController c = new GeheleDelingController();
        c.txtX.setText("10");
        c.txtY.setText("2");

        //Act
        c.bereken(null);

        //Assert
        assertEquals("5", c.txtResult.getText());

        //Deze test geeft null pointer exceptions want alle FXML-elementen zijn niet geinitialiseerd bij testing
    }
}