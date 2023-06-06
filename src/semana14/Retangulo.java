package semana14;

public class Retangulo {

        private double base;
        private double altura;
        
        public Retangulo(double base, double altura) {
            this.base = base;
            this.altura = altura;
        }
    
        public Retangulo(double valor) {
            this(valor, valor);
        }
        
        public double calcularArea() {
            return base * altura;
        }
        
        public double calcularPerimetro() {
            return 2 * (base + altura);
        }
        public double getBase() {
            return base;
    }


}