package source;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String opcion_y;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de a: ");
        double a = scanner.nextDouble();

        System.out.print("Ingrese el valor de b: ");
        double b = scanner.nextDouble();

        System.out.print("Ingrese el valor de c: ");
        double c = scanner.nextDouble();

        EcuacionSegundoGrado ecuacion = new EcuacionSegundoGrado(a, b, c);


        double discriminante = ecuacion.calcularDiscriminante();
        if (discriminante < 0) {
            System.out.println("La ecuación no tiene raíces reales.");
        } else if (discriminante == 0) {
            double raizUnica = ecuacion.calcularRaiz1();
            System.out.println("La ecuación tiene una raíz única: " + raizUnica);
        } else {
            double raiz1 = ecuacion.calcularRaiz1();
            double raiz2 = ecuacion.calcularRaiz2();
            System.out.println("Raíz 1: " + raiz1);
            System.out.println("Raíz 2: " + raiz2);
        }

        scanner.nextLine();
        System.out.println("Desea calcular el valor de 'y' ?: ");
        System.out.println("Ingrese (si/no): ");
        opcion_y = scanner.nextLine(); // Mover esta línea antes de cerrar el scanner
        System.out.println("\n");

        if (Objects.equals(opcion_y, "si")) {
            System.out.print("Ingrese el valor de x para calcular y: ");
            double x = scanner.nextDouble();
            double y = ecuacion.calcularY(x);
            System.out.println("El valor de y para x=" + x + " es: " + y);
        } else if (Objects.equals(opcion_y, "no")) {
            System.out.println("ADIOS!");
        } else {
            System.out.println("Valor ingresado incorrecto, intente nuevamente.");
        }

        scanner.close();
    }
}