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
    void bijTellen_preciezeTijdspanne2min4secEn3min3sec_Geeft5min7sec() {
        //arrange
        PreciezeTijdspanne t1=new PreciezeTijdspanne(2,4);
        PreciezeTijdspanne t2=new PreciezeTijdspanne(3, 3);
        //act
        t1.bijTellen(t2);
        //assert
        assertEquals(5,t1.getMinuten());
        assertEquals(7,t1.getSeconden());
    }


}