package dominio;

import java.time.LocalDate;
import java.util.ArrayList;

public class Actuacion {
    private LocalDate fecha;
    private ArrayList<Musico> directores;
    private ArrayList<MusicoSocio> musicosSocios;
    private ArrayList<MusicoRefuerzo> musicosRefuerzo;

    public Actuacion (LocalDate fecha) {
        this.fecha = fecha;
        this.directores = new ArrayList<>();
        this.musicosSocios = new ArrayList<>();
        this.musicosRefuerzo = new ArrayList<>();
    }

    public void annadirParticipante (Director director) {
        directores.add (director);
    }

    public void annadirParticipante (MusicoSocio musicoSocio) {
        musicosSocios.add(musicoSocio);
    }

    public void annadirParticipante (MusicoRefuerzo musicoRefuerzo) {
        musicosRefuerzo.add(musicoRefuerzo);
    }

    public String toString () {
        StringBuilder sb = new StringBuilder();

        sb.append(fecha).append("\n");
        for (Musico musico : directores) {
            sb.append(musico.toString()).append("\n");
        }

        for (MusicoSocio musicoSocio : musicosSocios) {
            sb.append(musicoSocio.toString()).append("\n");
        }
        for (MusicoRefuerzo musicoRefuerzo : musicosRefuerzo) {
            sb.append(musicoRefuerzo.toString()).append("\n");
        }
        sb.append("\n\n");
        return (sb.toString());
    }
}
