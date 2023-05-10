package org.example;

/**
 * Deze klasse houdt de gegevens van een kledingstuk bij
 */
public class KledingStuk {

    private final String naam;
    private final String type;
    private final double gewicht;

    public KledingStuk(String naam, String type, double gewicht) {
        this.naam = naam;
        this.type = type;
        this.gewicht = gewicht;
    }

    public String getNaam() {
        return naam;
    }

    public String getType() {
        return type;
    }

    public double getGewicht() {
        return gewicht;
    }
}
