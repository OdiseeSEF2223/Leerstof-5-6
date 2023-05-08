package be.odisee;

/**
 * Deze klasse houdt de gegevens van een rekening bij
 */
public class Rekening {

    /**
     * het unieke rekeningnummer van de rekening
     */
    private int nummer;
    /**
     * naam van de eigenaar
     */
    private String naam;
    /**
     * hoeveel geld er op de rekening staat
     */
    private double balans;

    public Rekening(int nummer, String naam, double balans) {
        this.nummer = nummer;
        this.naam = naam;
        this.balans = balans;
    }

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public double getBalans() {
        return balans;
    }

    public void setBalans(double balans) {
        this.balans = balans;
    }

    @Override
    public String toString() {
        return "Rekening{" +
                "nummer=" + nummer +
                ", naam='" + naam + '\'' +
                ", balans=" + balans +
                '}';
    }

    public void storten(double bedrag) {
        this.balans += bedrag;
    }

    public boolean afhalen(double bedrag) {
        if(this.balans >= bedrag){
            this.balans -= bedrag;
            return true;
        } else {
            return false;
        }
    }
}
