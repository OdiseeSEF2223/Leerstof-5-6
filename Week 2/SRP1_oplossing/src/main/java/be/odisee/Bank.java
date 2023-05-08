package be.odisee;

import java.util.ArrayList;

/**
 * Deze klasse beheert alle rekeningen
 */
public class Bank {

    /**
     * De arraylist met de rekeningen van de bank (dit mag niet static zijn, elke bank zijn eigen rekeningen)
     */
    private ArrayList<Rekening> rekeningen = new ArrayList<>();

    /**
     * Methode om een nieuwe rekening te open
     * @param nummer het rekening nummer
     * @param naam de naam van de eigenaar
     * @param balans de balans van de rekening
     * @return het rekeningnummer
     */
    public int openRekening(int nummer, String naam, double balans){
        // als rekeningnummer reeds bestaat -> return -1
        if(zoekRekening(nummer) != null){
            return -1;
        }

        Rekening r = new Rekening(nummer, naam, balans);
        rekeningen.add(r);
        return r.getNummer();
    }

    private Rekening zoekRekening(int nummer){
        for(Rekening r: rekeningen){
            if(r.getNummer() == nummer){
                return r;
            }
        }
        return null;
    }

    public boolean afhalen(int nummer, double bedrag){
        Rekening r = zoekRekening(nummer);
        if(r == null){
            return false;
        }

        return r.afhalen(bedrag);
    }

    public boolean storten(int nummer, double bedrag){
        Rekening r = zoekRekening(nummer);
        if(r == null){
            return false;
        }

        r.storten(bedrag);
        return true;
    }

    @Override
    public String toString(){
        String result = "Deze bank heeft " + rekeningen.size() + " rekeningen\n";
        for(Rekening r: rekeningen){
            result += r.toString() + "\n";
        }
        return result;
    }




}
