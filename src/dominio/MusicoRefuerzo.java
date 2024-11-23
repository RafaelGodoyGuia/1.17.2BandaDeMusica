package dominio;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class MusicoRefuerzo extends Musico {
    BigDecimal dinero;

    public MusicoRefuerzo (String nombre, String instrumento, BigDecimal dinero) {
        super (nombre, instrumento);
        this.dinero = dinero;
    }

    public String toString () {
        StringBuilder sb = new StringBuilder();
        DecimalFormat df = new DecimalFormat("#,##0.00€");

        sb.append(this.nombre).append(", ").append(this.instrumento).append(", ").append(df.format(dinero));
        return(sb.toString());
    }
}
