package com.example.huistaak_webshop;

import java.util.ArrayList;

public class Winkelmand {
    private final ArrayList<Boek> boeken = new ArrayList<Boek>();

    public Winkelmand() {
    }

    public void toeVoegen(final Boek b) {
        boeken.add(b);
    }

    public ArrayList<Boek> getBoeken() { return boeken; }

    public int aantal() { return boeken.size();}

}