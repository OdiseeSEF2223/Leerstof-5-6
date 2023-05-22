package be.odisee.oefTijdspanne;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class PreciezeTijdspanneTest {

    @Test
    void bijTellen_GewoneTijdspanne_GeeftCorrecteTijdspanne() {
        PreciezeTijdspanne t1=new PreciezeTijdspanne(2,3);
        Tijdspanne t2=new Tijdspanne(3);

        t1.bijTellen(t2);
        assertEquals(5,t1.getMinuten());
        assertEquals(3,t1.getSeconden());
    }

    @Test
    void bijTellen_preciezeTijdspanne2min4seEn3min3sec_Geeft5min7sec() {
        //TODO implement
        assertFalse(true);//Kijk naar de naam van deze method en codeer dit gedrag
    }


}