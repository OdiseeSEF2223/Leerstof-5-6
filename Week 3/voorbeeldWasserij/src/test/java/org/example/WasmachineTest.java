package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WasmachineTest {

    @Test
    public void isAan_AfterCtor_ReturnsFalse(){
        //Arrange
        Wasmachine m = new Wasmachine();

        //Act
        boolean result = m.isAan();

        //Assert
        assertFalse(result);
    }

    @Test
    public void zetAan_AfterCtor_isAanReturnsTrue(){
        //Arrange
        Wasmachine m = new Wasmachine();

        //Act
        m.zetAan();

        //Assert
        assertTrue(m.isAan());
    }

    @Test
    public void zetUit_AfterCtor_isAanReturnsFalse(){
        //Arrange
        Wasmachine m = new Wasmachine();

        //Act
        m.zetUit();

        //Assert
        assertFalse(m.isAan());
    }

    @Test
    public void zetUit_AfterZetAan_isAanReturnsFalse(){
        //Arrange
        Wasmachine m = new Wasmachine();
        m.zetAan();

        //Act
        m.zetUit();

        //Assert
        assertFalse(m.isAan());
    }

    @Test
    public void start_AfterCtor_isGestartIsFalse(){
        //Arrange
        Wasmachine m = new Wasmachine();

        //Act
        m.start(Programma.SNEL);

        //Assert
        assertFalse(m.isGestart());
    }


    @Test
    public void start_AfterZetAan_isProgrammaCorrect(){
        //Arrange
        Wasmachine m = new Wasmachine();
        m.zetAan();

        //Act
        m.start(Programma.SNEL);

        //Assert
        assertTrue(m.isGestart());
        assertEquals(Programma.SNEL, m.getProgramma());
    }

    @Test
    public void start_AfterNaGestart_isProgrammaUnchanged(){
        //Arrange
        Wasmachine m = new Wasmachine();
        m.zetAan();
        m.start(Programma.KATOEN);

        //Act
        m.start(Programma.SNEL);

        //Assert
        assertTrue(m.isGestart());
        assertEquals(Programma.KATOEN, m.getProgramma());
    }
}
