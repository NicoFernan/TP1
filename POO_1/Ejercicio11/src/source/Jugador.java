package source;
import java.util.ArrayList;
import java.util.List;

class Jugador {
    private String nombre;
    private List<String> palabras;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.palabras = new ArrayList<>();
    }

    public void agregarPalabra(String palabra, Diccionario diccionario) {
        if (diccionario.esPalabraValida(palabra)) {
            palabras.add(palabra);
        } else {
            System.out.println("La palabra no es válida.");
        }
    }

    private int calcularPuntaje(String palabra) {
        int puntaje = palabra.length();
        for (char letra : palabra.toCharArray()) {
            if ("kzxwq".contains(String.valueOf(letra))) {
                puntaje++;
            }
        }
        return puntaje;
    }

    public int getPuntajeTotal() {
        int puntajeTotal = 0;
        for (String palabra : palabras) {
            puntajeTotal += calcularPuntaje(palabra);
        }
        return puntajeTotal;
    }

    public String getNombre() {
        return nombre;
    }
}