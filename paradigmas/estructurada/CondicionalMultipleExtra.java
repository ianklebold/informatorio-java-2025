package paradigmas.estructurada;

public class CondicionalMultipleExtra {
    public static void main(String[] args) {
        
        // //ANTES DE JAVA 17
        String valor = "ESTE";
        int numeroDeLetras = 0;

        switch (valor) {
            case "NORTE":
            case "OESTE":
                numeroDeLetras = 5;
                break;
            case "SUR":
                numeroDeLetras = 3;
                break;
            case "ESTE":
                numeroDeLetras = 4;
                break;
            default:
                numeroDeLetras = 0;
                break;
        }
        System.out.println("Numero de letras " + numeroDeLetras);

        //EN JAVA 17
        // ->
        System.out.println( "Numero de letras " + 
            switch(valor){
                case "NORTE", "OESTE" -> 5;
                case "SUR" -> 3;
                case "ESTE" -> 4;
                default -> 0;
            }
        );

        //Switch Expression con ":" y yield
        System.out.println( "Numero de letras " + 
        switch(valor){
            case "NORTE", "OESTE" : yield 5;
            case "SUR" : yield 3;
            case "ESTE" : yield 4;
            default : yield 0;
        }
    );



    }
}
