package com.example.huistaak_webshop;
/* Biedt een toegangspunt voor de controller en de applicatie tot het Model.
    Is een compositie met de boekenIntentaris als compositieobject (maar niet met de boeken)
 */
public class BoekenWinkelModel {

    private final BoekenInventaris boeken=new BoekenInventaris();
    private Winkelmand teKopenBoeken = new Winkelmand();
    private final BestelBeleid prijsBerekening= new JavaAppBestelBeleid(); // Misschien willen we andere prijzen voor webwinkel, fysieke winkel, ...

    public BoekenWinkelModel() {
    }

    public BoekenInventaris getBoeken() {
        return boeken;
    }
    public Boek getBoek(final int index) {
            return boeken.getAll()[index];
    }
    public Winkelmand getWinkelmand() {
        return teKopenBoeken;
    }

    public BestelBeleid getPrijsBerekening() {
        return prijsBerekening;
    }

    public void nieuweBestelling() {
        teKopenBoeken= new Winkelmand();
    }

    /* Verantwoordelijk om de boeken die we verkopen bij te houden
    * is private dus enkel toegankelijk voor BoekenWinkelModel */
    private class BoekenInventaris {
        private final Boek[] boeken = {
                new Boek("Boek 1", 1),
                new Boek("Boek 2", 2),
                new Boek("Boek 3", 3),
                new Boek("Boek 4", 4),
                new Boek("Boek 5", 5),
                new Boek("Boek 6", 6),
                new Boek("Boek 7", 7),
                new Boek("Boek 8", 8),
                new Boek("Boek 9", 9),
                new Boek("Boek 10", 10),
                new Boek("Boek 11", 11),
                new Boek("Boek 12", 12)
        };

        public Boek[] getAll() {
            return boeken;
        }
    }

}
