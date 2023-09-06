package source;
import java.util.Scanner;

public class Juego {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabraJugadorUno;
        String palabraJugadorDos;
        System.out.println("--------------------------------------------");
        System.out.println("---------  Bienvenidos al juego!  ----------");
        System.out.println("--------------------------------------------");



        Jugador jugador1 = new Jugador("Jugador 1");
        Jugador jugador2 = new Jugador("Jugador 2");
        Diccionario diccionario = new Diccionario();

        System.out.println("Ingrese una palabra para " + jugador1.getNombre() + ":");
        palabraJugadorUno = sc.nextLine();
        jugador1.agregarPalabra(palabraJugadorUno, diccionario);

        System.out.println("Ingrese una palabra para " + jugador2.getNombre() + ":");
        palabraJugadorDos = sc.nextLine();
        jugador2.agregarPalabra(palabraJugadorDos, diccionario);

        System.out.println("Puntaje total de " + jugador1.getNombre() + ": " + jugador1.getPuntajeTotal());
        System.out.println("Puntaje total de " + jugador2.getNombre() + ": " + jugador2.getPuntajeTotal());

        if (jugador1.getPuntajeTotal() > jugador2.getPuntajeTotal()) {
            System.out.println(jugador1.getNombre() + " gana!");
        } else if (jugador2.getPuntajeTotal() > jugador1.getPuntajeTotal()) {
            System.out.println(jugador2.getNombre() + " gana!");
        } else {
            System.out.println("Empate!");
        }
    }
}
