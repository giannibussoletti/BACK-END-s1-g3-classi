package exercises.telefonia;


import java.util.Arrays;

public class SIM {

    //Attributi
    private String phoneNum;
    private int credit;
    private Chiamata[] listaChiamate;

    public SIM(String phoneNum) {
        this.phoneNum = phoneNum;
        listaChiamate = new Chiamata[5];
        credit = 0;

    }

    public SIM(String phoneNum, Chiamata[] call) {
        this.phoneNum = phoneNum;
        this.listaChiamate = call;
    }


    public static void printSim(SIM simPrint) {
        System.out.println(simPrint);
    }

    @Override
    public String toString() {
        return "SIM{" + "\n" +
                "numero di tel: " + phoneNum + "\n" +
                "listaChiamate: " + Arrays.toString(listaChiamate) + "\n" +
                "credito: " + credit + "\n" +
                '}';
    }
}
