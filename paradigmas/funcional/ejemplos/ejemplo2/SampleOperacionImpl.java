package ejemplo2;

public class SampleOperacionImpl {
    public static void main(String[] args) {
        Operacion suma = (x, y) -> x + y;
        Operacion resta = (number1, number2) -> number1 - number2;

        int resultado1 = suma.operar(5,2);
        int resultado2 = resta.operar(5,2);

        System.out.println(resultado1);
        System.out.println(resultado2);
    }
}
