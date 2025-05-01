package paradigmas.imperativa;
public class OperadoresOperandos {
    public static void main(String[] args) {

        //Prefija
        int valorInicial = 5;
        int valorPrefija = ++valorInicial;
        // int valorPrefija = --valorInicial;
        System.out.println(valorPrefija);

        //Sufija
        valorInicial = 5;
        int valorSufija = valorInicial++;
        // int valorSufija = valorInicial--;

        System.out.println(valorSufija);

        //Infija
        int suma = valorPrefija + valorSufija;
        int resta = 2 - 3;
        int multiplicacion = 2 * 3;
        int division = 10 / 5;

        System.out.println("Resultado Suma " + suma);
        System.out.println("Resultado Resta " + resta);
        System.out.println("Resultado Suma " + multiplicacion);
        System.out.println("Resultado Suma " + division);

        //Operador ternario
        //( Evaluacion )? valorSiVerdadero : ValorSiFalso;

        //Otras evaluaciones 
        // > mayor que
        // >= mayor igual
        // < menor que
        // < menor igual que
        // == Igual

        boolean esMayor = ( suma > resta )? true : false;
        System.out.println("Resultado operador ternario, es mayor? " + esMayor);


        final int ESTE_ES_UN_VALOR_CONSTANTE = 2;

    }
}
