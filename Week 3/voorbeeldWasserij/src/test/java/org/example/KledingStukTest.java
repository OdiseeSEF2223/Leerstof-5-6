package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KledingStukTest {

    @Test
    public void ctor_PropertiesSet(){
        //Arrange

        //Act
        KledingStuk k = new KledingStuk("naam", "type", 0.2);

        //Assert
        assertEquals("naam", k.getNaam());
        assertEquals("type", k.getType());
        assertEquals(0.2, k.getGewicht());
    }

}