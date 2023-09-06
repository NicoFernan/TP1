package source;

public class EcuacionSegundoGrado {
        private final double a;
        private final double b;
        private final double c;

        public EcuacionSegundoGrado(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public double calcularDiscriminante() {
            return (b * b) - (4 * a * c);
        }

        public double calcularRaiz1() {
            if (calcularDiscriminante() < 0) {
                return Double.NaN;

            } else {
                return (-b + Math.sqrt(calcularDiscriminante())) / (2 * a);
            }
        }

        public double calcularRaiz2() {
            if (calcularDiscriminante() < 0) {
                return Double.NaN;

            } else {
                return (-b - Math.sqrt(calcularDiscriminante())) / (2 * a);
            }
        }

        public double calcularY(double x) {
            return a * x * x + b * x + c;
        }

}
