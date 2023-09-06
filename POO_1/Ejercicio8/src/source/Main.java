package source;


public class Main {
    public static void main(String[] args) {

        GeneradorContraseña generador = new GeneradorContraseña();
        generador.PreguntarLongitud();
        System.out.println( "< " + generador.getContraseña() + " > - " + generador.getCondicion());
        System.out.println("Longitud de la contraseña: " + generador.getLongitud());

    }
}

