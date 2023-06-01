package com.example.huistaak_webshop;

public class Boek {
    private String naam;
    private double prijs;

    public Boek(String naam, double prijs) {
        this.naam = naam;
        this.prijs = prijs;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    public String toString(){
        return naam + ": " + prijs + " euro";
    }
}
