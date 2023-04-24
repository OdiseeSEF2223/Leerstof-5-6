package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        Scanner in = new Scanner(System.in);

        // lees een getal in
        System.out.println("Geef een getal in:");
        String name = in.nextLine();
        //tekst omzetten naar getal
        double getal = Double.parseDouble(name);
        // in.nextDouble() dit doet lijn 18 en 16 tegelijkertijd

        // bereken kwadraat en vierkantswortel
        double kwadraat = MathUtils.berekenKwadraat(getal);
        double sqrt = MathUtils.berekenVierkantswortel(getal);

        // print alles uit
        System.out.println("Het kwadraat is: " + kwadraat);
        System.out.println("De vierkantswortel is: " + sqrt);

    }
}