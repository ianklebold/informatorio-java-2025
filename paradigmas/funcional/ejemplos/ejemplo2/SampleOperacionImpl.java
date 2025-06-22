package ejemplo2;

public class SampleOperacionImpl {
    public static void main(String[] args) {
        Operacion operacion1 = (x, i) -> x + i;
        Operacion operacion2 = (x, i) -> x - i;

        int resultado1 = operacion1.operar(5,2);
        int resultado2 = operacion2.operar(5,2);

        System.out.println(resultado1);
        System.out.println(resultado2);
    }
}
