package exercises.eCommerce;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Carrello {
    private Cliente cliente;
    private Articolo[] Carrelloarticoli;
    private double totaleArticolo;

    public Carrello(Cliente cliente, Articolo[] Carrelloarticoli) {
        this.cliente = cliente;
        this.Carrelloarticoli = Carrelloarticoli;
    }

    public void calcoloCarrello() {
        double totale = 0;
        for (Articolo articolo : Carrelloarticoli) {
            totale += articolo.getPrezzo();
        }
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Il totale del carrello è:" + df.format(totale));

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
