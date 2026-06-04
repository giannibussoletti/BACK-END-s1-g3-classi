package exercises.eCommerce;

import java.util.Arrays;

public class Carrello {
    private Cliente cliente;
    private Articolo[] Carrelloarticoli;
    private double totaleArticolo;

    public Carrello(Cliente cliente, Articolo[] Carrelloarticoli) {
        this.cliente = cliente;
        this.Carrelloarticoli = Carrelloarticoli;
    }

    public double calcoloCarrello() {
        double totale = 0;
        for (Articolo articolo : Carrelloarticoli) {
            totale += articolo.prezzo();
        }
        return totale;
    }


    @Override
    public String toString() {
        return "Carrello{" +
                "cliente=" + cliente +
                ", Carrelloarticoli=" + Arrays.toString(Carrelloarticoli) +
                ", totaleArticolo=" + totaleArticolo +
                '}';
    }
}
