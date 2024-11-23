package dominio;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class BandaMusica {
    private String nombre;
    private ArrayList<Actuacion> actuaciones;

    public BandaMusica (String nombre) {
        this.nombre = nombre;
        actuaciones = new ArrayList<>();
    }

    public void annadirActuacion (Actuacion actuacion) {
        actuaciones.add(actuacion);
    }

    public String toString () {
        StringBuilder sb = new StringBuilder();

        sb.append(this.nombre).append("\n\n");
        for (Actuacion actuacion : actuaciones) {
            sb.append(actuacion.toString());
        }
        return (sb.toString());
    }
}
