package dominio;

public class Director extends Musico{
    public Director (String nombre) {
        super (nombre, "director");
    }

    public String toString () {
        StringBuilder sb = new StringBuilder();

        sb.append(this.nombre).append(", ").append(this.instrumento);
        return (sb.toString());
    }
}
