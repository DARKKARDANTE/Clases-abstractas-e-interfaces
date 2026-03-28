public class Ciclista extends Atleta implements Evaluable {

    private int tiempoHoras;
    private double kmRecorridos;


    @Override
<<<<<<< HEAD
    public double calcularRendimiento() {
        return  kmRecorridos/tiempoHoras;
=======
    public void calcularRendimiento() {
>>>>>>> c7c0cb4a8554556829b2f4836ca445791dcd4424

    }

    @Override
    public String clasificarNivel() {
<<<<<<< HEAD
        double r = calcularRendimiento();
        if (r < 30) return "Básico";
        else if (r <= 70) return "Competente";
        else return "Elite";
=======
        return "";
>>>>>>> c7c0cb4a8554556829b2f4836ca445791dcd4424
    }

    @Override
    public double calcularBono() {
<<<<<<< HEAD
        double nivel = calcularRendimiento();
        if (nivel < 30) return 50000;
        else if (nivel <= 70) return 150000;
        else return 300000;
=======
        return 0;
>>>>>>> c7c0cb4a8554556829b2f4836ca445791dcd4424
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
