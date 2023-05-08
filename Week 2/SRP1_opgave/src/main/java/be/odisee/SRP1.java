package be.odisee;
import java.util.Arrays;
import java.util.ArrayList;

/**
 * Application class executing the scenario and tracking the bankaccounts.
 */
public class SRP1 {

    /**
     * An index into the arrays below that hold the bank accounts. Index = what account are we working with.
     */
    public static int rekeningIndex=0;
    static Integer[] rekeningNummers= {1,2,666};  //maybe I should use arraylist?
    static String[] rekeningNamen={"me", "myself", "Geeraard"};
    static Double[] rekeningBalansen ={100.0,0.0,666.0};

    // wijzig de rekening
    public static void rekeningVerrichting (String type,double bedrag) {
        if(rekeningIndex>=rekeningNummers.length) System.out.println("Rekening bestaat niet"); //Hebben we een rekening geselecteerd?
        if (type.equals("afhalen")) {
            if(rekeningBalansen[rekeningIndex]<bedrag) {
                System.out.println("Te weinig op rekening");
            } else {
                rekeningBalansen[rekeningIndex]-=bedrag;
            }
        } else if (type.equals("storten")) {
            rekeningBalansen[rekeningIndex]+=bedrag;
        }
    }

    /**
     * Executes the scenario.
     * increase the first account balance by 100
     * decrease the third account balance by 200
     * decrease the second account balance by 100 (should fail)
     * add a fourth account
     * increase the fourth account balance by 10
     */
    public static void main(String[] args) {
       /* List<String> rekeningNummers= new ArrayList<String>(Arrays.asList(1,2,666));
        List<String> rekeningNamen=Arrays.asList("meer", "koop", "Geeraard");
        List<Currency> rekeningBedragen=new ArrayList<Currency>(Arrays.asList(100.0,0.0,666.0));*/
        System.out.println("Rekeningen aan de start:");
        System.out.println(Arrays.toString(rekeningNummers));
        System.out.println(Arrays.toString(rekeningNamen));
        System.out.println(Arrays.toString(rekeningBalansen));

        rekeningIndex=0;
        rekeningVerrichting("storten",100.0);
        rekeningIndex=1;
        rekeningVerrichting("afhalen",100.0);
        rekeningIndex++;
        rekeningVerrichting("afhalen",100.0);

        System.out.println("Rekeningen na transacties:");
        System.out.println(Arrays.toString(rekeningNummers));
        System.out.println(Arrays.toString(rekeningNamen));
        System.out.println(Arrays.toString(rekeningBalansen));

        // add a fourth account and initialize it to 0.0
        ArrayList<Integer> tempRekeningNummers= new ArrayList<Integer>(Arrays.asList(rekeningNummers)); //maak een tijdelijke arrayList welke de nieuwe rekening kan toevoegen
        tempRekeningNummers.add(42);
        rekeningNummers=tempRekeningNummers.toArray(rekeningNummers); // vul de oude array met de nieuwe waarden
        ArrayList<Double> tempRekeningBedragen= new ArrayList<Double>(Arrays.asList(rekeningBalansen)); // maak een tijdelijke arrayList welke de nieuwe rekening kan toevoegen
        tempRekeningBedragen.add(0.0);
        rekeningBalansen =tempRekeningBedragen.toArray(rekeningBalansen); // vul de oude array met de nieuwe waarden

        //increase the fourth account balance by 10
        rekeningIndex=3;
        rekeningVerrichting("storten",10.0);

        System.out.println("Rekeningen op het einde:");
        System.out.println(Arrays.toString(rekeningNummers));
        System.out.println(Arrays.toString(rekeningNamen));
        System.out.println(Arrays.toString(rekeningBalansen));
    }
}