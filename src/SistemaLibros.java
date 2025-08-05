import java.util.Scanner;

public class SistemaLibros {
    public static void main(String[] args) {
        System.out.println("***Sistema prestamo libros***");


        final var DISTANCIA_PERMITIDA_KM=3;
        var consola = new Scanner(System.in);
        System.out.print("¿Cuenta con credencial de estudiante (true/false)? ");
        var tienesCredencial = Boolean.parseBoolean(consola.nextLine());

        System.out.println("A cuantos kilometros vives de la biblioteca?");

        var distanciaBibliotecaKM = Integer.parseInt(consola.nextLine());

        var esElegiblePrestamo =
                tienesCredencial || distanciaBibliotecaKM < DISTANCIA_PERMITIDA_KM;
        System.out.println("Eres elefible para prestamos de libro? " + esElegiblePrestamo) ;

    }
}
