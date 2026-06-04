package exercises.telefonia;

public class Chiamata {
    private double minutes;
    private String numberCalled;

    public Chiamata(double minutes, String numberCalled) {
        this.minutes = minutes;
        this.numberCalled = numberCalled;
    }

    @Override
    public String toString() {
        return "\n" + "Chiamata{" + "\n" +
                "minuti:" + minutes + "\n" +
                "numero chiamato:" + numberCalled +
                '}' + "\n";
    }
}
