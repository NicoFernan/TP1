package source;

public class Cola {
    private Nodo inicioCola, finalCola;

    public Cola() {
        inicioCola = null;
        finalCola = null;
    }

    public boolean ColaVacia() {
        return inicioCola == null;
    }

    public void Insertar(int informacion) {
        Nodo nuevo_nodo = new Nodo(informacion);
        nuevo_nodo.setSiguiente(null);

        if (ColaVacia()) {
            inicioCola = nuevo_nodo;
            finalCola = nuevo_nodo;
        } else {
            finalCola.setSiguiente(nuevo_nodo);
            finalCola = nuevo_nodo;
        }

        System.out.println("Elemento encolado: " + informacion);
    }

    public void Desencolar() {
        if (!ColaVacia()) {
            int informacion = inicioCola.getInformacion();

            if (inicioCola == finalCola) {
                inicioCola = null;
                finalCola = null;
            } else {
                inicioCola = inicioCola.getSiguiente();
            }

            System.out.println("Elemento desencolado: " + informacion);
        } else {
            System.out.println("La cola está vacía, no se puede desencolar.");
        }
    }

    private Nodo colaOriginalInicio, colaOriginalFinal;

    public void GuardarColaOriginal() {
        colaOriginalInicio = inicioCola;
        colaOriginalFinal = finalCola;
    }

    public void RecuperarColaOriginal() {
        if (colaOriginalInicio != null) {
            inicioCola = colaOriginalInicio;
            finalCola = colaOriginalFinal;
            System.out.println("Cola recuperada.");
        } else {
            System.out.println("No se ha guardado una cola original previamente.");
        }
    }

    public void MostrarContenido() {
        Nodo recorrido = inicioCola;
        String ColaInvertida = "";
        while (recorrido != null) {
            ColaInvertida += recorrido.getInformacion() + " ";
            recorrido = recorrido.getSiguiente();
        }
        System.out.println("Contenido de la cola: " + ColaInvertida);
    }
}