package source;

public class Main {
    public static void main(String[] args)
    {
        ListaEnlazada lista = new ListaEnlazada();

        System.out.println("Esta vacia: "+ lista.estaVacia());
        

        lista.addPrimero("Jorge");
        lista.addPrimero(20);
        lista.addPrimero("hellow");
        lista.addPrimero(4);

        System.out.println("Primer elemento: "+ lista.obtener(0));
        System.out.println("Ultimo: "+ lista.obtener(lista.size()-1));
        System.out.println("Index 2:"+lista.obtener(2));

        System.out.println("Esta vacia: "+ lista.estaVacia());
        System.out.println("Tamaño: " + lista.size());
    }
}