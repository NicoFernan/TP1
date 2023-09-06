package source;

import java.util.ArrayList;
import java.util.List;

class Diccionario {
    private List<String> palabrasValidas;

    public Diccionario() { //PALABRAS VALIDAS PARA EL JUEGO
        palabrasValidas = new ArrayList<>();

        palabrasValidas.add("java");
        palabrasValidas.add("programacion");
        palabrasValidas.add("diccionario");
        palabrasValidas.add("xyz");
        palabrasValidas.add("mesi");
        palabrasValidas.add("kkk");

    }

    public boolean esPalabraValida(String palabra) {
        return palabrasValidas.contains(palabra);
    }
}