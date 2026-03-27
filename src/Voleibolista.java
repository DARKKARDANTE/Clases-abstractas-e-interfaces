public class Natacion extends Deporte implements AccionesDeportivas{
    private double distanciaRecorrida;
    private double tiempo;
    @Override
    public void compitor() {
        System.out.println("estamos compitiendo en natacion");

    }

    @Override
    public void entrenar() {
        System.out.println("estamos entrenando natacion");

    }

    @Override
    public void mostrarReglas() {
        System.out.println("no se permite que los deportistas se ahoguen");

    }

    public Natacion() {
    }

    public Natacion(String jugeador, int dorsal, double porcentajeFatiga, double distanciaRecorrida, double tiempo) {
        super(jugeador, dorsal, porcentajeFatiga);
        this.distanciaRecorrida = distanciaRecorrida;
        this.tiempo = tiempo;

    }

    public double getDistanciaRecorrida() {
        return distanciaRecorrida;
    }

    public void setDistanciaRecorrida(double distanciaRecorrida) {
        this.distanciaRecorrida = distanciaRecorrida;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "Natacion{" +
                "distanciaRecorrida=" + distanciaRecorrida +
                ", tiempo=" + tiempo +
                '}';
    }
}
