package entities;

import java.util.Objects;
import java.util.Random;

public class User {
    
//    private Chiamata[] listaChiamate;

    //  Esempio di costruzione di una classe
    //  Attributi statici
    public static final int MIN_LUNG_PASS = 5;

    //  Attributi
    // abbiamo impostato private sugli attributi, adesso andiamo a decidere se i vari attributi possono essere letti, scritti o entrambi.
    private int id;
    private String password;
    private String email;
    // Per definire un attributo con dei valori predefiniti si usano gli Enum
    // Andando a restringere i possibili valori a solo quelli definiti nell'Enum
    private Role role;

    // I Getter e i Setter non servono per tutti gli attributi, sta a noi decidere quali
    // attributi potranno essere letti e quali scritti

    //GETTER
    //Sono dei metodi che vanno a leggere l'informazione dell'attributo

    //  Costruttori
    public User(String password, String email) {
        this.password = password;
        this.email = email;
        Random random = new Random();
        this.id = random.nextInt(1, 10000);
        //Qui abbiamo impostato di base che ogni registrazione
        this.role = Role.USER;
    }

    //  Metodi Static
    public static boolean passwordValid(User user) {
        return user.password.length() >= MIN_LUNG_PASS;
    }

    public int getId() {
        return id;
    }

    // LA password voglio tenerla solo per uso interno e non faccio il getter

    public Role getRole() {
        return role;
    }

    public String getEmail() {
        return email;
    }

    //Setter
    //Sono dei metodi che vanno a scrivere l'informazione dell'attributo
// Nei setter possiamo anche inserire dei controlli che validino o meno l'attributo da settare.
    public void setEmail(String email) {
        // TODO: Validare email ricevuta
        if (!email.isEmpty())
            this.email = email;
    }

    public void setPassword(String password) {
        // TODO: Validare password ricevuta
        if (password.length() > MIN_LUNG_PASS)
            this.password = password;
    }

    //  Metodi di istanza
    public void inviaMail(String testo) {
        System.out.println("Inviata email a:");
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", role=" + role +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(password, user.password) && Objects.equals(email, user.email) && role == user.role;
    }


}
