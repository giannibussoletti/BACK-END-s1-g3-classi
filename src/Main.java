import entities.Circle;
import entities.User;

public class Main {
    public static void main(String[] args) {
//        La classe è un raggruppamento concettuale di oggetti che hanno
//        caratteristiche e comportamenti simili.
//        Nella vita di tutti i giorni, siamo già abituati a utilizzare in ogni
//        momento il concetto di classe, interagendo con gli oggetti che ci circondano
//        Alcuni esempi di classe che usiamo tutti i giorni:
//        • Classe Animale
//        • Classe Automobile
//        • Classe Smartphone

//        La classe è un blueprint che definisce cosa accomuna un gruppo di oggetti.
//        Esempio -> La Classe automobile definisce che ogni auto ha una targa a può accelerare.
//        L'oggetto Auto_Di_Marco è l'istanza(creazione di un oggetto da una classe) reale con una targa
//        specifica e una velocità attuale.
//        Abbiamo importato la Classe Circle, creata in entities, per usare i suoi metodi e creare i singoli cerchi
//        tramite la creazioni dei singoli cerchi
        Circle circleOne = new Circle();
        Circle circleTwo = new Circle(10.3);
        Circle circleThree = new Circle(20.5, 10.4, 4.1);
        // Gli oggetti possono essere null e accedere a questi ultimi va a creare una
        // null point exception, facendo andare in crash il programma.

//        circleOne.printInfo();
//        circleTwo.printInfo();
//        circleThree.printInfo();
//        Circle.printNumeriCreati();

        User aldo = new User("ciao213", "aldo");
        System.out.println(User.passwordValid(aldo));
        User aldo2 = new User("ciao213", "aldo");
        ;
//        aldo.id = 1;
//        aldo2.id = 1;
// Con == non si ha una vera comparazione in Java, perchè compara le celle di memoria.
//        if (aldo == aldo2) System.out.println("Sono uguali");
//        else System.out.println("Sono diversi");
// Anche equals() dietro le quinte usa == e quindi va fatto override
        // Così come per il metodo toString() va fatto un override per rendere il print nel terminale leggibile
//        if (aldo.equals(aldo2)) System.out.println("Sono uguali");
//Incapsulamento
        // Si tratta di nascondere i dati della classe per proteggerli per esempio.
        // aldo.role = Role.ADMIN; // <--- questa cosa non può succedere
        //Da errore perché ora role è private
        // Per fare questo abbiamo diverse alternative
        //-----METODO PRIVATE-----
        //Si mette private invece che public
        //Consigliato perché è la cosa più sicura da fare
//        Di solito i metodi vengono messi public mentre gli attributi private
//        in questo modo i metodi possono accedere agli attributi interni alla classe
//        Ma questi ultimi non sono modificabili direttamente dall'esterno senza un metodo.
        //----PACKAGE FRIENDLY
        //Tutti gli attributi che non hanno ne public ne private
        // possono essere visti solo all'interno di quel package.
    }

}