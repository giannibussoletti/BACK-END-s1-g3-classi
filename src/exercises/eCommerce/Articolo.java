package exercises.eCommerce;

public class Articolo {
    private final String codiceArticolo;
    private final String descArticolo;
    private final double prezzo;
    private int pezziDisp;

    public Articolo(String codiceArticolo, String descArticolo, double prezzo) {
        this.codiceArticolo = codiceArticolo;
        this.descArticolo = descArticolo;
        this.prezzo = prezzo;


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

    public double getPrezzo() {
        return this.prezzo; // Usa 'return' per restituire il valore numerico
    }
}
