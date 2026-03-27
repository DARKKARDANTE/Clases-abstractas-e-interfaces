public abstract class Atleta {
    protected String Nombre;
    protected  int edad ;
    protected  int horasEntrenamiento;

    public Atleta() {
    }

    public Atleta(String nombre, int edad, int horasEntrenamiento) {
        this.Nombre = nombre;
        this.edad = edad;
        this.horasEntrenamiento = horasEntrenamiento;
    }



    public void mostrarDatos(){
        System.out.println("Nombre "+ Nombre);
        System.out.println("Edad  "+ edad);
        System.out.println("Horas de entrenamiento "+ horasEntrenamiento);
    }

    public abstract void calcularRendimiento();
}
