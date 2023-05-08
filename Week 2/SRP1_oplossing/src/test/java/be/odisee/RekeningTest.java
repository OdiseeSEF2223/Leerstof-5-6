package be.odisee;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class RekeningTest {

    //Door dit hier te zetten, ga je afhankelijkheid introduceren tussen opeenvolgende testen
    // Het resultaat van de ene test kan een andere beinvloeden
    //Rekening r = new Rekening(1, "test", 5);

    //Beter is:
    Rekening r;
    @BeforeEach
    public void begin(){
        r = new Rekening(1, "test", 5);
    }

    @Test
    void storten_bedragPositief_balansVerhoogdMetBedrag() {
        // Arrange

        // Act
        r.storten(5);

        // Assert
        assertEquals(r.getBalans(), 10);
    }

    @Test
    void storten_bedragNegatief_balansNietVeranderd() {
        // Arrange

        // Act
        r.storten(-5);

        // Assert
        assertEquals(5, r.getBalans());
    }

    @Test
    void afhalen_BedragPositiefenSaldoToerijkend_BalansIsVerminderdEnReturnsTrue() {
        //Arrange

        //Act
        boolean result = r.afhalen(4);

        //Assert
        assertTrue(result);
        assertEquals(1, r.getBalans());
    }


    @Test
    void afhalen_BedragPositiefenSaldoOnToerijkend_BalansIsGelijkEnReturnsFalse() {
        //Arrange

        //Act
        boolean result = r.afhalen(40);

        //Assert
        assertFalse(result);
        assertEquals(5, r.getBalans());
    }
}