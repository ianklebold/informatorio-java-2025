package paradigmas.estructurada;

public class CondicionalSimpleDoble {
    public static void main(String[] args) {
        //Condicional Simple 
        /*
         * If ( condición ) 
            { // Sentencias} 
        */

        boolean esUnDiaLluvioso = true;

        if (esUnDiaLluvioso) {
            System.out.println("Si! es un dia lluvioso");
        }
        System.out.println("Continuacion del programa");
        
        //Condicional doble
        /*
         * If ( condicion ) 
            {//Sentencias} 
            else {//Sentencias}
         */
        if (!esUnDiaLluvioso) {
            System.out.println("Si! es un dia lluvioso");

        }else{
            System.out.println("No, no es un dia lluvioso");
        }
        System.out.println("Continuacion del programa");

    }
}