package exercises.rettangolo;

public class Main {
    static void main() {
        Rettangolo rettangolo01 = new Rettangolo(6, 4);
        Rettangolo rettangolo02 = new Rettangolo(10, 20);
        rettangolo01.printRect();

        Rettangolo.printTwoRect(rettangolo01, rettangolo02);
    }
}
