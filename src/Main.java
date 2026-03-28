
public class Main {
    public static void main(String[] args) {

        Ciclista c = new Ciclista("Juan", 25, 10, 200, 40);
        Boxeador b = new Boxeador("Carlos", 28, 12, 50, 5);
        Voleibolista v = new Voleibolista("Luis", 22, 8, 20, 10);

        c.mostrarDatos();
        System.out.println("Rendimiento : " + c.calcularRendimiento());
        System.out.println("Nivel : "+c.clasificarNivel());
        System.out.println("Bono : "+c.calcularBono());
        System.out.println("=============================================================");

        b.mostrarDatos();
        System.out.println("Rendimiento : "+b.calcularRendimiento());
        System.out.println("Nivel : "+b.clasificarNivel());
        System.out.println("Bono : "+b.calcularBono());
        System.out.println("=============================================================");

        v.mostrarDatos();
        System.out.println("Rendimiento : "+v.calcularRendimiento());
        System.out.println("Nivel : "+v.clasificarNivel());
        System.out.println("Bono : "+v.calcularBono());
        System.out.println("=============================================================");


        double mejorRendimiento = 0;
        Atleta mejorAtleta = null;

        Atleta[] atletas = {c, b, v};

        for (Atleta a : atletas) {
            double rendimiento = a.calcularRendimiento();

            if (rendimiento > mejorRendimiento) {
                mejorRendimiento = rendimiento;
                mejorAtleta = a;
            }
        }

        System.out.println("Mejor atleta:");
        mejorAtleta.mostrarDatos();
        System.out.println("Rendimiento: " + mejorRendimiento);
    }




}