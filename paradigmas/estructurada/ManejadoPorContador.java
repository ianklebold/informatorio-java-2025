package paradigmas.estructurada;

public class ManejadoPorContador {
    public static void main(String[] args) {
        //Manejado por contador - bucle for 

        /*
         * for ( indice declarado;condición;inc/dec de índice )
            { // Sentencias}
            Ejecuta el ciclo N veces
         */

        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
        }

        for (int i = 1 , j = 10; i < j ; i++,j--) {
            System.out.println(i + "   " + j);
        }

        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("Dentro del bucle i = # " + i + " Soy el elemento j =  #"+j);
            }
        }
    
    }
}
