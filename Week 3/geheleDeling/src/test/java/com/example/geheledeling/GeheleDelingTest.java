package com.example.geheledeling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeheleDelingTest {

    @Test
    void bereken_X10Y2_Resultaat5() {
        //Arrange
        GeheleDeling g = new GeheleDeling();

        //Act
        int result = g.bereken(10, 2);

        //Assert
        assertEquals(5, result);
    }
}