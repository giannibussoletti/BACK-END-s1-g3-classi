package exercises.eCommerce;

import java.util.Calendar;
import java.util.Date;

public class Main {
    static void main() {

        Date d1 = new Date(2021, Calendar.FEBRUARY, 3);
        Cliente cliente01 = new Cliente("1325", "Mario Rossi", "mario@rossi.it", d1);


        Articolo[] carrelloArt = new Articolo[3];
        carrelloArt[0] = new Articolo("159874", "Un telefono ultimo modello", 300.40);
        carrelloArt[1] = new Articolo("5987411", "Un computer come nuovo", 765.30);
        carrelloArt[2] = new Articolo("4053830", "Ottimo per cucinare", 220.34);


        Carrello carrelloTot = new Carrello(cliente01, carrelloArt);
    }
}
