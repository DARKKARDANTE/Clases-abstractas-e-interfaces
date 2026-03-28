public class Voleibolista extends Atleta implements Evaluable {
<<<<<<< HEAD
    private int saquesEfectivos;
    private int bloqueos;

    @Override
    public double calcularRendimiento() {
        return (saquesEfectivos*2)+(bloqueos*3);
=======
    private String posicion;
    private int bloqueos;

    @Override
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

    public Voleibolista() {
    }

<<<<<<< HEAD
    public Voleibolista(String nombre, int edad, int horasEntrenamiento, int saquesEfectivos, int bloqueos) {
        super(nombre, edad, horasEntrenamiento);
        this.saquesEfectivos = saquesEfectivos;
        this.bloqueos = bloqueos;
    }

    public int getsaquesEfectivos() {
        return saquesEfectivos;
    }

    public void setsaquesEfectivos(int saquesEfectivos) {
        this.saquesEfectivos = saquesEfectivos;
=======
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
>>>>>>> c7c0cb4a8554556829b2f4836ca445791dcd4424
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
<<<<<<< HEAD
                "saquesEfectivos='" + saquesEfectivos + '\'' +
=======
                "posicion='" + posicion + '\'' +
>>>>>>> c7c0cb4a8554556829b2f4836ca445791dcd4424
                ", bloqueos=" + bloqueos +
                '}';
    }
}