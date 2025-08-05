public class OperadoresAsignacion {
    public static void main(String[] args) {
        System.out.println("***Operadores de asignacion***");

        //Asignacion =
        var miNumero = 10;
        int miNumero2;
        miNumero2=15;
        //Asignacion compuesto
        //+=
        miNumero += 5; // miNumero = mInumero + 5; -> 15
        System.out.println("minumero =" + miNumero);

        //-=, *=; /= Y %=
         miNumero *= 2; // miNumero = minumero *2 -> 30
        System.out.println("miNumero = " + miNumero);

        //Asignacion de variables multiples
        int a = 10, b = 15, c = 20;
        System.out.printf("a = %d, b = %d, c = %d\n", a, b, c);



    }
}
