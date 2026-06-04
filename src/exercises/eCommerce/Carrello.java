package exercises.eCommerce;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Carrello {
    private final Cliente cliente;
    private final Articolo[] Carrelloarticoli;

    public Carrello(Cliente cliente, Articolo[] Carrelloarticoli) {
        this.cliente = cliente;
        this.Carrelloarticoli = Carrelloarticoli;
    }

    public double calcoloCarrello() {
        double totale = 0;
        for (Articolo articolo : Carrelloarticoli) {
            totale += articolo.getPrezzo();
        }
        DecimalFormat df = new DecimalFormat("#.##");
        return Double.parseDouble(df.format(totale));

    }


    @Override
    public String toString() {
        return "Carrello{" +
                "cliente=" + cliente +
                ", Carrelloarticoli=" + Arrays.toString(Carrelloarticoli) +
                ", totaleArticolo=" + calcoloCarrello() +
                '}';
    }
}
