import java.sql.SQLOutput;

public class Futbol extends Deporte implements AccionesDeportivas{

    private int marcador;
    private int goles;

    @Override
    public void compitor() {
        System.out.println("Estamos compitiendo en futbol");

    }

    @Override
    public void entrenar() {
        System.out.println("estamos entrenando futbol");

    }

    @Override
    public void mostrarReglas() {
        System.out.println("las reglas son jugar con los pies");

    }

    public Futbol() {

    }

    public Futbol(String jugeador, int dorsal, double porcentajeFatiga, int marcador, int goles) {
        super(jugeador, dorsal, porcentajeFatiga);
        this.marcador = marcador;
        this.goles = goles;
    }

    public int getMarcador() {
        return marcador;
    }

    public void setMarcador(int marcador) {
        this.marcador = marcador;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    @Override
    public String toString() {
        return "Futbol{" +
                "marcador=" + marcador +
                ", goles=" + goles +
                '}';
    }
}
