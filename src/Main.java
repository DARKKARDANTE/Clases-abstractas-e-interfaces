
public class Main {
    public static void main(String[] args) {

<<<<<<< HEAD
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
=======

        Futbol f1 = new Futbol("PEDRO",3, 98,10,2);
        Baloncesto b1 = new Baloncesto("dIANA", 4, 23, 48,2);
        Natacion n1 = new Natacion("Andrea",45,23,52,10.48);

        f1.compitor();
        f1.entrenar();
        f1.mostrarReglas();

        b1.compitor();
        b1.entrenar();
        b1.mostrarReglas();

        n1.compitor();
        n1.entrenar();
        n1.mostrarReglas();



        Deporte d2= new Futbol("Gabriel", 36, 45,36,4);
        ((Futbol)d2).compitor();
        ((Futbol)d2).entrenar();
        ((Futbol)d2).mostrarReglas();

        if(d2 instanceof Futbol ){
            ((Futbol)d2).compitor();

>>>>>>> c7c0cb4a8554556829b2f4836ca445791dcd4424
        }

        System.out.println("Mejor atleta:");
        mejorAtleta.mostrarDatos();
        System.out.println("Rendimiento: " + mejorRendimiento);
    }




}