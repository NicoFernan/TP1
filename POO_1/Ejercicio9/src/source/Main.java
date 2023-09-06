package source;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    private Scanner scanner = new Scanner(System.in);

    public void run() {
        System.out.println("Decida el formato de las fechas ( 1 o 2 ): ");
        System.out.println("1. dd-MM-yyyy");
        System.out.println("2. MM-dd-yyyy");
        int formato = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Recuerde que los valores deben ser numeros, en caso de fechas de un digito completar con 0.");
        System.out.println("Ingrese la primera fecha:");
        String fechaStr1 = scanner.nextLine();
        System.out.println("Ingrese la segunda fecha:");
        String fechaStr2 = scanner.nextLine();
        System.out.println("Ingrese la tercera fecha:");
        String fechaStr3 = scanner.nextLine();

        LocalDate fecha1 = Fecha.parseFecha(fechaStr1, formato);
        LocalDate fecha2 = Fecha.parseFecha(fechaStr2, formato);
        LocalDate fecha3 = Fecha.parseFecha(fechaStr3, formato);

        System.out.println("Resultado:");
        System.out.println("Fecha 2 está entre Fecha 1 y Fecha 3: " + Fecha.estaEntreFechas(fecha2, fecha1, fecha3));
        System.out.println("Fecha 1 está entre Fecha 2 y Fecha 3: " + Fecha.estaEntreFechas(fecha1, fecha2, fecha3));
        System.out.println("Fecha 3 está entre Fecha 1 y Fecha 2: " + Fecha.estaEntreFechas(fecha3, fecha1, fecha2));

        if (Fecha.esMayor(fecha1, fecha2)) {
            System.out.println("Fecha 1 es mayor que Fecha 2");
        } else if (Fecha.esMenor(fecha1, fecha2)) {
            System.out.println("Fecha 1 es menor que Fecha 2");
        } else {
            System.out.println("Fecha 1 es igual a Fecha 2");
        }

        if (Fecha.esMayor(fecha2, fecha3)) {
            System.out.println("Fecha 2 es mayor que Fecha 3");
        } else if (Fecha.esMenor(fecha2, fecha3)) {
            System.out.println("Fecha 2 es menor que Fecha 3");
        } else {
            System.out.println("Fecha 2 es igual a Fecha 3");
        }

        if (Fecha.esMayor(fecha3, fecha1)) {
            System.out.println("Fecha 3 es mayor que Fecha 1");
        } else if (Fecha.esMenor(fecha3, fecha1)) {
            System.out.println("Fecha 3 es menor que Fecha 1");
        } else {
            System.out.println("Fecha 3 es igual a Fecha 1");
        }
    }

    public static void main(String[] args) {
        Main fechaManager = new Main();
        fechaManager.run();
    }
}