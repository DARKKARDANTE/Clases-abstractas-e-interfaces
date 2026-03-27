public class Ciclista extends Atleta implements Evaluable {

    private int tiempoHoras;
    private double kmRecorridos;


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

    public Ciclista() {
    }

    public Ciclista(String nombre, int edad, int horasEntrenamiento, int tiempoHoras, double kmRecorridos) {
        super(nombre, edad, horasEntrenamiento);
        this.tiempoHoras = tiempoHoras;
        this.kmRecorridos = kmRecorridos;
    }

    public int getTiempoHoras() {
        return tiempoHoras;
    }

    public void setTiempoHoras(int tiempoHoras) {
        this.tiempoHoras = tiempoHoras;
    }

    public double getKmRecorridos() {
        return kmRecorridos;
    }

    public void setKmRecorridos(double kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }

    @Override
    public String toString() {
        return "Ciclista{" +
                "tiempoHoras=" + tiempoHoras +
                ", kmRecorridos=" + kmRecorridos +
                '}';
    }

}
