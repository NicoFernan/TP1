package source;

public class Main {
    public static void main(String[] argumentos){

        ListaEnlazada lista = new ListaEnlazada();

        if (lista.listaVacia()){
            System.out.println("La lista está vacía!\n");
        }

        System.out.println("-----   CARGANDO LISTA   -----\n");

        lista.agregarElemento(9);
        lista.agregarElemento(10);
        lista.agregarElemento(11);
        lista.agregarElemento(12);
        lista.agregarElemento(13);

        lista.mostrarLista();

        lista.insertarElemento(912, 5);
        System.out.println("Lista post-inserción en la tercera posición: \n");
        lista.mostrarLista();

        System.out.printf("La lista tiene: " + lista.listaLong() + " elementos!!\n");

        System.out.printf("El elemento que se encuentra en la posicion 3 es: " + lista.recuperarElemento(3));
    }
}