import java.util.Scanner;

public class SistemaPrestamoLibros {
    public static void main(String[] args) {
        System.out.println("***Sistema préstamo libros***");

        final var DISTANCIA_PERMITIDA_KM = 3;
        var consola = new Scanner(System.in);

        System.out.print("¿Cuenta con credencial de estudiante (true/false)? ");
        var entrada = consola.nextLine().toLowerCase();

        while (!entrada.equals("true") && !entrada.equals("false")) {
            System.out.print("Entrada inválida. Escriba 'true' o 'false': ");
            entrada = consola.nextLine().toLowerCase();
        }

        var tienesCredencial = Boolean.parseBoolean(entrada);

        System.out.print("¿A cuántos kilómetros vives de la biblioteca? ");
        var distanciaBibliotecaKM = Integer.parseInt(consola.nextLine());

        var esElegiblePrestamo =
                tienesCredencial || distanciaBibliotecaKM < DISTANCIA_PERMITIDA_KM;

        System.out.println("¿Eres elegible para préstamos de libro? " + esElegiblePrestamo);
    }
}
