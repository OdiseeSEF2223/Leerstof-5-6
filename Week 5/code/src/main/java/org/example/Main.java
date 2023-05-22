package org.example;



public class Main {

    /*
    Dit is geen goede code, vermijd dit
     */
    public class Medewerker{}
    public class NietBetaaldeMedewerker extends Medewerker{}
    public class Stageair extends NietBetaaldeMedewerker {}

    public static void main(String[] args) {

        System.out.println("Hello world!");

        int getal = 305;
        byte getalByte = (byte) getal;
        double getaldouble = getal;
        float getalFloat = getal;

        System.out.println(getalByte); //casten - expliciet
        System.out.println(getaldouble); // impliciet
        System.out.println(getalFloat); // impliciet

        Main main = new Main();
        main.test();

        main.printSom(5, 10);  // int uitgeprint
        main.printSom(5.1, 10.2); // double uitgeprint
        main.printSom(5.1, 10); // param b kan automatisch omgezet worden naar double -> print double
        main.printSom((int)5.1, 10); // int uitgeprint
    }

    public void test(){
        Medewerker m = new Stageair(); // dit gaat automatisch - van beneden naar boven in de klassenstructuur#
        if(m.getClass() == Stageair.class) {
            Stageair s = (Stageair) m;
            System.out.println("OK");
        } else if(m instanceof NietBetaaldeMedewerker){

        }else {
            System.out.println("Deze persoon is geen stageair");
        }

    }

    // overloading voorbeeld
    @Override
    public String toString(){
        return "";
    }

    //subtyping voorbeeld
    public void printSom(int a, int b){
        System.out.println("Int functie");
    }

    public void printSom(double a, double b){
        System.out.println("double functie");
    }
}