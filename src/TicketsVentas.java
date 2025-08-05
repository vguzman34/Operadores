import java.util.Scanner;

public class TicketsVentas {
    public static void main(String[] args) {
        System.out.println("***Generacion de tickets ventas***");
        var consola = new Scanner(System.in);

        System.out.println("Precio de la leche: ");
        double precioLeche = Double.parseDouble(consola.nextLine());

        System.out.println("Precio del pan: ");
        double precioPan = Double.parseDouble(consola.nextLine());

        System.out.println("Precio de la lechuga: ");
        double precioLechuga = Double.parseDouble(consola.nextLine());

        System.out.println("Precio del plátano: ");
        double precioPlatano = Double.parseDouble(consola.nextLine());

        System.out.println("Aplicar algun descuento (%)? ");
        var descuentoPorcentaje = Integer.parseInt(consola.nextLine());

// Calculo del subtotal
        double subtotal = precioLeche + precioPan + precioLechuga + precioPlatano;

// Aplicar el descuento
        var descuento = subtotal * (descuentoPorcentaje / 100.0);

// Subtotal con descuento
        var subtotalConDescuento = subtotal - descuento;

// Cálculo con impuesto (16%)
        var impuesto = subtotalConDescuento * 0.16;

// Cálculo total de la compra (con impuesto)
        var costoTotalCompra = subtotalConDescuento + impuesto;

// Imprimir el ticket de la venta
        System.out.printf("""
                 Subtotal               : $%.2f
                 Descuento :$% (%d%%)
                 Impuesto (16%%)        : $%.2f
                 Costo total de compra : $%.2f
                 
                 """, subtotal, descuento,descuentoPorcentaje, impuesto, costoTotalCompra);
    }
}
