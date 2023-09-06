package source;

public class Nodo {
    private int informacion;
    private Nodo siguiente;

    public Nodo(int informacion) {
        this.informacion = informacion;
        this.siguiente = null;
    }

    public int getInformacion() {
        return informacion;
    }

    public void setInformacion(int informacion) {
        this.informacion = informacion;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}