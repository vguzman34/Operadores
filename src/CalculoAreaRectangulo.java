import java.util.Scanner;

public class CalculoAreaRectangulo {
    public static void main(String[] args) {
        System.out.println("***Calculo area rectangulo***");

        var consola = new Scanner(System.in);

        System.out.print("Proporciona la base : ");
        var base = Integer.parseInt(consola.nextLine());

        System.out.println("Proporciona la altura");
        var altura =Integer.parseInt(consola.nextLine());

        //Realiza el calculo del area
        var areaRectangulo = base * altura;
        System.out.println("Area del rectangulo : " + areaRectangulo);

        //Realizar el calculo del perimetro
        var areaPerimetro = (base + altura) *2;
        System.out.println("Perimetro del rectangulo : " + areaRectangulo);

    }
}
