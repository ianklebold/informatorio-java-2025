package ejemplo3;

public class SampleFIImpl {
    public static void main(String[] args) {
        //Implementamos un metodo a la interfaz funcional
        //La i es el argumento del parametro isNegative
        // i < 0 es el codigo
        //Aqui solo se define para usarlo mas adelante. En ningun momento esto se ejecuta
        NegativeInterface<Integer> lambda = i -> i < 0;

        System.out.println("Evaluate : " + lambda.isNegative(-1)); //true
        System.out.println("Evaluate : " + lambda.isNegative(1)); //false
    }
}
