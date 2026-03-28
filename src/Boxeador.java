    public class Boxeador extends Atleta implements Evaluable {

        private int golpesAcertados;
        private int combatesGanados;

        @Override
        public double calcularRendimiento() {
            return (golpesAcertados * 0.5) + (combatesGanados * 10);
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

        public Boxeador() {
        }

        public Boxeador(String nombre, int edad, int horasEntrenamiento, int golpesAcertados, int combatesGanados) {
            super(nombre, edad, horasEntrenamiento);
            this.golpesAcertados = golpesAcertados;
            this.combatesGanados = combatesGanados;
        }

        public int getgolpesAcertados() {
            return golpesAcertados;
        }

        public void setgolpesAcertados(int golpesAcertados) {
            this.golpesAcertados = golpesAcertados;
        }

        public int getCombatesGanados() {
            return combatesGanados;
        }

        public void setCombatesGanados(int combatesGanados) {
            this.combatesGanados = combatesGanados;
        }

        @Override
        public String toString() {
            return "Boxeador{" +
                    "golpesAcertados='" + golpesAcertados + '\'' +
                    ", combatesGanados=" + combatesGanados +
                    '}';
        }
    }