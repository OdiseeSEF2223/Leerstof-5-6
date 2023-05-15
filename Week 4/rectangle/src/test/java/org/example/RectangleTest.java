package org.example;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @org.junit.jupiter.api.Test
    void getArea_AfterLengthChanged_AreaUpdated() {
        // Arrange
        Rectangle r = new Rectangle(10, 10);
        r.setLength(5);

        // Act
        double result = r.getArea();

        // Assert
        assertEquals(50, result);
    }
}