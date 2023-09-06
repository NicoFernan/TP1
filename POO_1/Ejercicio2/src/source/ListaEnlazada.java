package source;

public class ListaEnlazada {
    private  Nodo inicio = null;
    private Nodo finall = null;

    public void crearLista(){
        inicio = null;
        finall = null;
    }

    public boolean listaVacia () {
        return (inicio == null);
    }

    public void agregarElemento(Object dato){

        Nodo nuevoNode = new Nodo(dato);

        if(listaVacia()) {
            inicio = nuevoNode;
            finall = nuevoNode;
        } else {
            finall.setSiguiente(nuevoNode);
            nuevoNode.setAnterior(finall);
            finall = nuevoNode;
        }
    }

    public int listaLong () {
        if (listaVacia()){
            return 0;
        }
        int cont = 0;

        Nodo nodoTemp = inicio;

        while (nodoTemp != null) {
            cont++;
            nodoTemp = nodoTemp.getSiguiente();
        }

        return cont;
    }

    public void eliminarElemento (int pos) {
        if (listaVacia()){
            return;
        }
        
        if (pos >= 1 && pos <=listaLong()){
            inicio = inicio.getSiguiente();
            
            if (inicio != null){
                inicio.setAnterior(null);
            }
        } else if (pos == listaLong()) {
            if (finall != null){
                finall.setSiguiente(null);
            }
        } else {
            Nodo nodoactual = inicio;

            for (int i= 0; i<pos -1 ; i++){
                nodoactual = nodoactual.getSiguiente();
            }

            nodoactual.getAnterior().setSiguiente(nodoactual.getSiguiente());
            nodoactual.getSiguiente().setAnterior(nodoactual.getAnterior());

        }
    }

    void insertarElemento (Object dato, int pos){
        Nodo nuevoNode = new Nodo(dato);

        if (listaVacia()) {
            inicio = nuevoNode;
            finall = nuevoNode;
        } else if (pos == 1) {
            nuevoNode.setSiguiente(inicio);
            inicio.setAnterior(nuevoNode);
            inicio = nuevoNode;
        } else if (pos == listaLong()) {
            finall.setSiguiente(nuevoNode);
            nuevoNode.setAnterior(finall);
            finall = nuevoNode;
        } else {
            Nodo nodoActual = inicio;

            for (int i =0; i<pos -2; i++){
                nodoActual = nodoActual.getSiguiente();
            }

            nuevoNode.setSiguiente(nodoActual.getSiguiente());
            nuevoNode.setAnterior(nodoActual);
            nodoActual.getSiguiente().setAnterior(nuevoNode);
            nodoActual.setSiguiente(nuevoNode);
        }
    }

    public Object recuperarElemento ( int pos){
        Nodo nodoActual = inicio;

        for (int i=0; i<pos -1; i++){
            nodoActual = nodoActual.getSiguiente();
        }
        return nodoActual.getDato();
    }
    public void mostrarLista(){
        Nodo nodoMostrar = inicio;
        int pos = 0;

        System.out.println("Lista: ");

        while (nodoMostrar != null) {
            pos++;
            System.out.println(pos+ " : " + nodoMostrar.getDato());
            nodoMostrar = nodoMostrar.getSiguiente();
        }
        System.out.println("\n");
    }
}
