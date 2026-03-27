public abstract class Deporte {
    protected String jugador;
    protected  int dorsal ;
    protected  double porcentajeFatiga;

    public Deporte() {
    }

    public Deporte(String jugador, int dorsal, double porcentajeFatiga) {
        this.jugador = jugador;
        this.dorsal = dorsal;
        this.porcentajeFatiga = porcentajeFatiga;
    }

    public void mostrarInfo(){
        System.out.println("jugador "+ jugador);
        System.out.println("dorsal  "+ dorsal);
        System.out.println("Porcentaje de fatiga "+ porcentajeFatiga);
    }

    public abstract void mostrarReglas();
}
