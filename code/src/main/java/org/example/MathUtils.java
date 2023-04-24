package org.example;

public class MathUtils {

    public static double berekenKwadraat(double getal){
        // dit doet hetzelfde als hieronder
        // return Math.pow(getal, 2);
        return getal * getal;
    }

    public static double berekenVierkantswortel(double getal){
        return Math.sqrt(getal);
    }
}
