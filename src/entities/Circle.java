package entities;

public class Circle {
    // Attributi statici
    //può essere richiamato in qualsiasi momento senza avere oggetti creati
    public static int numCerchiCreati = 0;
    // Andiamo ad aggiungere la lista attributi
    // Questi sono gli attributi base di ogni cerchio, la sua struttura
    // Il ciclo di vita e la visibilità di una variabile (Scope) dipende da dove viene dichiarata
    public double radius; //Scope globale, tutti i metodi possono accedere a quell'attributo
    public double x;
    public double y;

    // Per convenzione i costruttori vanno subito dopo la dichiarazione dei parametri
    public Circle() {
        // Nessun parametro preimpostato
        // Per richiamare questo costruttore si usa Circle circle = new Circle();
        x = 0.0;
        y = 0.0;
        radius = 1.0;
        numCerchiCreati++;
    }

    public Circle(double radius) {
        this.radius = radius;
        numCerchiCreati++;
    }

    public Circle(double radius, double x, double y) {
        this.radius = radius;
        this.y = y;
        this.x = x;
        numCerchiCreati++;
    }

    //Lista metodi statici
    public static void printNumeriCreati() {
        System.out.println("Numero cerchi creati: " + numCerchiCreati);
    }

    // Andiamo ad aggiungere la lista metodi
//    i metodi delle classi
    public double getDiameter() {
        return radius * 2;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public void printInfo() {
        int test = 0; // Scope visibile solo nel metodo printInfo()
        System.out.println("x,y:" + x + " " + y);
        System.out.println("Raggio: " + radius);
        System.out.println("Diametro: " + getDiameter());
        System.out.println("Perimetro: " + getPerimeter());
        System.out.println("Area: " + getArea());
        System.out.println(" ");

        //----------STATIC----------
//        I metodi statici sono definiti metodi di classe
//        i metodi non statici sono propri dell'oggetto
//        Ed hanno bisogno di oggetti per essere usati
//        stessa cosa per gli attributi
//        i metodi static sono attributi che non si ripetono nella classe
//        ce n'è uno per tutta la classe
    }
}
