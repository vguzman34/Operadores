import java.util.Scanner;

public class SistemaDescuentosVip {
    public static void main(String[] args) {
        System.out.println("***Sistema de descuentos vip***");
        final var NO_PRODUCTOS_DESCUENTO = 10;
        var consola = new Scanner(System.in);
        System.out.print("Cuantos productos comprastes hoy? ");
        var cantidadProductos = Integer.parseInt(consola.nextLine());

        System.out.println("Tienes la membresia de la tienda (true/false)? ");
        var tienesMembresia = Boolean.parseBoolean(consola.nextLine());

        var esElegibleDescuentoVip = cantidadProductos >= 3 && tienesMembresia;

        System.out.println("¿Es elegible para descuento VIP? " + esElegibleDescuentoVip);
    }
}