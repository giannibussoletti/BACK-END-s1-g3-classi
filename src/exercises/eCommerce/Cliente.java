package exercises.eCommerce;

import java.util.Date;

public class Cliente {
    private final String codiceCliente;
    private final String nameSurname;
    private final String email;
    private final Date dataIscrizione;

    public Cliente(String codiceCliente, String nameSurname, String email, Date dataIscrizione) {
        this.codiceCliente = codiceCliente;
        this.nameSurname = nameSurname;
        this.email = email;
        this.dataIscrizione = dataIscrizione;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "codiceCliente='" + codiceCliente + '\'' +
                ", nameSurname='" + nameSurname + '\'' +
                ", email='" + email + '\'' +
                ", dataIscrizione=" + dataIscrizione +
                '}';
    }
}
