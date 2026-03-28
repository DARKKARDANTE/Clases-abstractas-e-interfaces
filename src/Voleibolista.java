public class Voleibolista extends Atleta implements Evaluable {
    private int saquesEfectivos;
    private int bloqueos;

    @Override
    public double calcularRendimiento() {
        return (saquesEfectivos*2)+(bloqueos*3);

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

    public Voleibolista() {
    }

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
                "saquesEfectivos='" + saquesEfectivos + '\'' +
                ", bloqueos=" + bloqueos +
                '}';
    }
}