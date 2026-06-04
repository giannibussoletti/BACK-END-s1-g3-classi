package exercises.rettangolo;

public class Rettangolo {
    //Attributi
    private double larg;
    private double alte;


    public Rettangolo(double larg, double alte) {
        this.larg = larg;
        this.alte = alte;
    }

    public static void printTwoRect(Rettangolo rect1, Rettangolo rect2) {
        System.out.println("Il perimetro del primo rettangolo è: " + rect1.perimeter() + " \n" + "La sua area è: " + rect1.area());
        System.out.println("Il perimetro del secondo rettangolo è: " + rect2.perimeter() + " \n" + "La sua area è: " + rect2.area());
        double totalPerimeter = (rect1.perimeter() + rect2.perimeter());
        System.out.println("La somma dei perimetri è: " + totalPerimeter);
        double totalArea = (rect1.area() + rect2.area());
        System.out.println("La somma delle aree è: " + totalArea);


    }

    private double perimeter() {
        return (larg + alte) * 2;
    }

    private double area() {
        return larg * alte;
    }

    public void printRect() {
        System.out.println("Il perimetro del rettangolo è: " + perimeter() + " \n" + "La sua area è: " + area());
    }

}
