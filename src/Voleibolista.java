public class Voleibolista extends Atleta implements Evaluable {
    private String posicion;
    private int bloqueos;

    @Override
    public void calcularRendimiento() {

    }

    @Override
    public String clasificarNivel() {
        return "";
    }

    @Override
    public double calcularBono() {
        return 0;
    }

    public Voleibolista() {
    }

    public Voleibolista(String nombre, int edad, int horasEntrenamiento, String posicion, int bloqueos) {
        super(nombre, edad, horasEntrenamiento);
        this.posicion = posicion;
        this.bloqueos = bloqueos;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getBloqueos() {
        return bloqueos;
    }

    public void setBloqueos(int bloqueos) {
        this.bloqueos = bloqueos;
    }

    @Override
    public String toString() {
        return "Voleibolista{" +
                "posicion='" + posicion + '\'' +
                ", bloqueos=" + bloqueos +
                '}';
    }
}