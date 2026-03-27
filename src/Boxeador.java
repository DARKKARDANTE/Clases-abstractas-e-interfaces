    public class Boxeador extends Atleta implements Evaluable {

        private String categoriaPeso;
        private int combatesGanados;

        @Override
        public void calcularRendimiento() {

        }

        @Override
        public String clasificarNivel() {
            return "";
        }

        @Override
        public double calcularBono() {
            return 0;
        }

        public Boxeador() {
        }

        public Boxeador(String nombre, int edad, int horasEntrenamiento, String categoriaPeso, int combatesGanados) {
            super(nombre, edad, horasEntrenamiento);
            this.categoriaPeso = categoriaPeso;
            this.combatesGanados = combatesGanados;
        }

        public String getCategoriaPeso() {
            return categoriaPeso;
        }

        public void setCategoriaPeso(String categoriaPeso) {
            this.categoriaPeso = categoriaPeso;
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
                    "categoriaPeso='" + categoriaPeso + '\'' +
                    ", combatesGanados=" + combatesGanados +
                    '}';
        }
    }