package com.example.geheledeling;

public class Deling {

    private int x = 0;
    private int y = 5;

    private String naam = "test";

    @Override
    public boolean equals(Object obj){
        Deling d = (Deling) obj; // object omzetten naar een object van deze klasse
        return this.x == d.x && this.y == d.y && this.naam.equals(d.naam);
        //dit is de standaard
        return this == obj;
    }
}
