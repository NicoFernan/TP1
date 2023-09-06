package source;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Fecha {

    private static DateTimeFormatter dateFormatter1 = DateTimeFormatter.ofPattern("dd-MM-yyyy"); //dateFormatter1 muestra este formato
    private static DateTimeFormatter dateFormatter2 = DateTimeFormatter.ofPattern("MM-dd-yyyy"); //dateFormatter2 muestra este formato

    public static LocalDate parseFecha(String fechaStr, int formato) {
        DateTimeFormatter formatter = formato == 1 ? dateFormatter1 : dateFormatter2;
        return LocalDate.parse(fechaStr, formatter);
    }

    public static boolean estaEntreFechas(LocalDate fecha, LocalDate fechaInicio, LocalDate fechaFin) {
        return fecha.isAfter(fechaInicio) && fecha.isBefore(fechaFin);
    }

    public static boolean esMayor(LocalDate fecha1, LocalDate fecha2) {
        return fecha1.isAfter(fecha2);
    }

    public static boolean esMenor(LocalDate fecha1, LocalDate fecha2) {
        return fecha1.isBefore(fecha2);
    }
}