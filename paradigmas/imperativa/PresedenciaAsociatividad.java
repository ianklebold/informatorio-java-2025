package paradigmas.imperativa;
public class PresedenciaAsociatividad {
    public static void main(String[] args) {
        int value1 = 2 + 4 * 6 / 3 - 1;
        System.out.println(value1);

        System.out.println("Resultado es : " + 5 + 5);

        boolean valor = true;
        System.out.println( !valor );

        System.out.println( true && false); //AND 
        System.out.println( false || false); //OR
        
    }
}
