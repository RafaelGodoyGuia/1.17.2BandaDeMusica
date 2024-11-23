package dominio;

public class MusicoSocio extends Musico{
    private int numSocio;

    public MusicoSocio (String nombre, String instrumento, int numSocio) {
        super(nombre, instrumento);
        this.numSocio = numSocio;
    }

    public String toString () {
        StringBuilder sb = new StringBuilder();

        sb.append(this.nombre).append(", ").append(this.instrumento).append(", ").append(this.numSocio);
        return(sb.toString());
    }
}
