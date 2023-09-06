package source;

public class Main {
    public static void main(String[] args) {
        Cola cola = new Cola();

        if (cola.ColaVacia()) {
            System.out.println("La cola está vacía.");
        } else {
            System.out.println("La cola no está vacía.");
        }

        System.out.println(" ");
        cola.Insertar(50);
        cola.Insertar(20);

        cola.MostrarContenido();

        if (cola.ColaVacia()) {
            System.out.println("La cola está vacía.");
        } else {
            System.out.println("\nLa cola no está vacía.");
        }

        System.out.println(" ");
        cola.GuardarColaOriginal();

        cola.Insertar(40);
        System.out.println(" ");

        cola.MostrarContenido();
        System.out.println(" ");

        cola.Desencolar();

        System.out.println("Después de desencolar:");
        cola.MostrarContenido();


        cola.RecuperarColaOriginal();
        System.out.println("Cola recuperada :");

        cola.MostrarContenido();
    }
}