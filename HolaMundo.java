/**
 * Muestra la frase Hola Mundo
 */
public class HolaMundo {
    public static void main (String[] args) {
        String rojo = "\033[31m";
        String azul = "\033[34m";
        System.out.println(rojo + "¡Hola mundo!");
        System.out.println(azul + "Aquí estamos haciendo pruebas en Git.");
    }
}