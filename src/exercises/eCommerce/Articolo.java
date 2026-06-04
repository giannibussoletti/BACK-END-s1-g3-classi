package exercises.eCommerce;

public class Articolo {
    private String codiceArticolo;
    private String descArticolo;
    private double prezzo;
    private int pezziDisp;

    public Articolo(String codiceArticolo, String descArticolo, double prezzo, int pezziDisp) {
        this.codiceArticolo = codiceArticolo;
        this.descArticolo = descArticolo;
        this.prezzo = prezzo;
        this.pezziDisp = pezziDisp;


    }

    @Override
    public String toString() {
        return "Articolo{" +
                "codiceArticolo='" + codiceArticolo + '\'' +
                ", descArticolo='" + descArticolo + '\'' +
                ", prezzo=" + prezzo +
                ", pezziDisp=" + pezziDisp +
                '}';
    }
}
