package be.odisee;
import java.util.Arrays;
import java.util.ArrayList;

/**
 * Application class executing the scenario and tracking the bankaccounts.
 */
public class SRP1 {

    /**
     * Executes the scenario.
     * increase the first account balance by 100
     * decrease the third account balance by 200
     * decrease the second account balance by 100 (should fail)
     * add a fourth account
     * increase the fourth account balance by 10
     */
    public static void main(String[] args) {
        Bank bank = new Bank();
        int r1 = bank.openRekening(1, "me", 100.0);
        int r2 = bank.openRekening(2, "myself", 0);
        int r3 = bank.openRekening(666, "Geeraard", 666);

        System.out.println("Rekeningen aan de start:");
        // bank.printInfo(); // dit gaat dan altijd naar de console schrijven
        System.out.println(bank);

        bank.storten(r1, 100);
        bank.afhalen(r2, 100);
        bank.afhalen(r3, 100);

        System.out.println("Rekeningen na transacties:");
        System.out.println(bank);

        // add a fourth account and initialize it to 0.0
        int r4 = bank.openRekening(42, "Geeraard", 0);

        //increase the fourth account balance by 10
        bank.storten(r4, 10);

        System.out.println("Rekeningen op het einde:");
        System.out.println(bank);
    }
}