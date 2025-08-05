public class OperadoresUnarios {
    public static void main(String[] args) {
        System.out.println("***operadores unarios *** ");
        int a = 3, b = -2, resultado;
        var c = true;

        //Operador Uninario +
        resultado = +a;
        System.out.println("resultado +a = " + resultado);

        //Operador urinario -
        resultado = -a;
        System.out.println("resultado = -a = " + resultado);

        // Operador urinarios incrementos/descremento
       // pre-incremento
        a = 3;
        resultado = ++a; // primero se incremento el valor
        System.out.println("resultado ++a = " + resultado);
        System.out.println("a ya se incremento = " + a);
        // Post incremento
        a = 3;
        resultado = ++a; // primero se usa el valor y despues se incrementa
        System.out.println("resultado a++ = " + resultado);
        System.out.println("a en este momento se incrementa = " + a);

        // pre decremento
        b = -2;
        resultado = --b; // Primero decrementa b y luego lo asigna a resultado
        System.out.println("resultado --b = " + resultado);
        System.out.println("b ya se decrementó = " + b);

        // post decremento
        resultado = b--; // post-decremento: primero se usa el valor de b, luego se decrementa

        System.out.println("resultado b-- = " + resultado);
        System.out.println("b en este momento se decrementa = " + b);









    }
}
