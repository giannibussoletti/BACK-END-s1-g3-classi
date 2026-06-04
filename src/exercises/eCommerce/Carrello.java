package exercises.eCommerce;

import java.util.Arrays;

public class Carrello {
    private Cliente cliente;
    private Articolo[] Carrelloarticoli;
    private double totaleArticolo;

    public Carrello(Cliente cliente, Articolo[] Carrelloarticoli, double totaleArticolo) {
        this.cliente = cliente;
        this.Carrelloarticoli = Carrelloarticoli;
        this.totaleArticolo = totaleArticolo;
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
