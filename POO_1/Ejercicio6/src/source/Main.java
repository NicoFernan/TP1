package source;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Libro libro1 = new Libro("Berserk-Tomo1", "Kentaro Miura", 150, 1000);

        Libro libro2 = new Libro("Berserk-Tomo2", "Kentaro Miura", 300, 900);

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        libro1.prestar();
        libro1.prestar();
        libro1.prestar();
        libro2.devolver();
        libro2.prestar();
        libro2.prestar();

        biblioteca.mostrarLibros();

        if (libro1.getNumPaginas() > libro2.getNumPaginas()) {
            System.out.println("El libro '" + libro1.getTitulo() + "' tiene más páginas.");
        } else {
            System.out.println("El libro '" + libro2.getTitulo() + "' tiene más páginas.");
        }

        System.out.println("La cantidad de préstamos de la blilioteca es de: " + biblioteca.cantidadTotalPrestamos());
    }
}