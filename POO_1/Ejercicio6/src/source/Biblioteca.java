package source;
import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Libro> libros;

    public Biblioteca() {
        libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void mostrarLibros() {
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }

    public Libro buscarLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null;
    }

    public Libro buscarLibroPorAutor(String autor) {
        for (Libro libro : libros) {
            if (libro.getAutor().equalsIgnoreCase(autor)) {
                return libro;
            }
        }
        return null;
    }

    public int cantidadTotalPrestamos() {
        int totalPrestamos = 0;
        for (Libro libro : libros) {
            totalPrestamos += libro.getNumEjemplaresPrestados();
        }
        return totalPrestamos;
    }
}