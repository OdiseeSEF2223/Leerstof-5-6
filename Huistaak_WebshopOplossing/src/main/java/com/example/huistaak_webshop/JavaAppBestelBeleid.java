package com.example.huistaak_webshop;

public class JavaAppBestelBeleid implements BestelBeleid {
    public double berekenProductenPrijs(final Winkelmand winkelmand) {
        double totaal = 0.0;
        for (Boek boek : winkelmand.getBoeken()) {
            totaal += boek.getPrijs();
        }
        return totaal;
    }

    public double berekenVerzendPrijs(final Winkelmand winkelmand) {
        if (berekenProductenPrijs(winkelmand) >= 20.0) {
            return 0.0; // Gratis verzending
        } else {
            return 5.0; // Verzendkosten van 5 euro
        }
    }

    public double berekenTotaalPrijs(final Winkelmand winkelmand) {
        return berekenProductenPrijs(winkelmand)+berekenVerzendPrijs(winkelmand);
    }

    @Override
    public int bepaalWachtTermijn(final Winkelmand winkelmand) {
        // Stel de verwachte levertijd in op basis van het aantal items
        return (winkelmand.aantal() < 10) ? 5 : 10;
    }
}
