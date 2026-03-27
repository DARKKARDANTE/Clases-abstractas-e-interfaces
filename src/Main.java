
public class Main {
    public static void main(String[] args) {


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

        }
    }
}