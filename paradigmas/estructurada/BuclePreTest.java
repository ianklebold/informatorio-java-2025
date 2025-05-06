package paradigmas.estructurada;

public class BuclePreTest {
    public static void main(String[] args) {
        //Bucle pre-test While
        /*
         * While ( condición )
            { // Sentencias}
            Ejecuta el ciclo de 0 a N veces
         */

        int condition = 1;

        while ( condition < 10 ) {
            //Sentencias
            System.out.println("Hola soy el numero " + condition);
            condition++;
        }

    }
}
