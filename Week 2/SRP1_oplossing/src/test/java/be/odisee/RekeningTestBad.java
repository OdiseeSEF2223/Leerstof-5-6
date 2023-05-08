package be.odisee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RekeningTestBad {

    // Doe dit hier niet zo na, dit is om aan te tonen dat de volgorde van testen belangrijk is:
    // Wissel de testen van plaats en het geeft een ander resultaat
    private Rekening r = new Rekening(1, "test", 5);


    @Test
    void afhalen() {
        r.afhalen(7);
        assertEquals(5, r.getBalans());

    }

    @Test
    void storten() {
        r.storten(5);

        assertEquals(10, r.getBalans());
    }

}