package exercises.telefonia;

public class Main {
    static void main() {
        SIM simOne = new SIM("+39123456789");
        SIM.printSim(simOne);

        Chiamata[] call = new Chiamata[5];
        call[0] = new Chiamata(10, "+3913246898");
        call[1] = new Chiamata(30, "+3913345952");
        call[2] = new Chiamata(40, "+3913265786");
        call[3] = new Chiamata(50, "+3913244354");
        call[4] = new Chiamata(20, "+3923432245");

        SIM simTwo = new SIM("+3585126782", call);
        SIM.printSim(simTwo);

    }
}
