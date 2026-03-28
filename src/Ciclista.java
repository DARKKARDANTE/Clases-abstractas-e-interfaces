public class Ciclista extends Atleta implements Evaluable {

    private int tiempoHoras;
    private double kmRecorridos;


    @Override
    public double calcularRendimiento() {
        return  kmRecorridos/tiempoHoras;

    }

    @Override
    public String clasificarNivel() {
        double r = calcularRendimiento();
        if (r < 30) return "Básico";
        else if (r <= 70) return "Competente";
        else return "Elite";
    }

    @Override
    public double calcularBono() {
        double nivel = calcularRendimiento();
        if (nivel < 30) return 50000;
        else if (nivel <= 70) return 150000;
        else return 300000;
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
