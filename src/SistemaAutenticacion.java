import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {
        System.out.println("***Sistema de autenticacion***" );

        final var USUARIO_VALIDO  = "Admin";
        final var PASSWORD_VALIDO = "123";

        var consola = new Scanner(System.in);

        System.out.println("Cual es tu usuario ? ");
        var usuarioIngresado = consola.nextLine();

        System.out.print("Cual es tu password ? ");
        var PassawordIngresado = consola.nextLine();

        var sonDatosCorrectos = usuarioIngresado.equals(USUARIO_VALIDO)
                   && PassawordIngresado.equals(PASSWORD_VALIDO);

        System.out.println(sonDatosCorrectos
                ? "✅ Son datos correctos"
                : "❌ Usuario o contraseña incorrectos");


    }
}
