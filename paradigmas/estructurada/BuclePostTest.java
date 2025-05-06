package paradigmas.estructurada;

public class BuclePostTest {
    public static void main(String[] args) {
        //Bucle post-test Do While
        /*
         * Do{//Sentencias} 
            while ( condición )    
            Ejecuta el ciclo de 1 a N veces
         */
        int condition = 10;
        do{
            System.out.println("Adios! soy el numero " + condition);
            condition--;
        }while(condition > 0);

    }
}
