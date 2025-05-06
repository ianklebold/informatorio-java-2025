package paradigmas.estructurada;

public class CondicionalMultiple {
    public static void main(String[] args) {
        
        //Condicional Multiple

        boolean esUnDiaLluvioso = true;
        final String DIA = "Sabado";

        if (esUnDiaLluvioso && DIA == "MARTES") {
            System.out.println("Hoy es : " + DIA  + "Y esta lloviendo");
        }else if (esUnDiaLluvioso == false ) {
            System.out.println("Hoy es : " + DIA + " Y no esta lloviendo");
        }else{
            System.out.println("Este es el mensaje por default" );
        }

        System.out.println("Sigue con el programa");

        //Condicional multiple mas complejo

        if( esUnDiaLluvioso ){
            System.out.println("No te olvides el paraguas");

            if (DIA == "LUNES" || DIA == "MARTES") {
                System.out.println("Hoy es : " + DIA + " Te espera un dia lluvioso");
            }else{
                //Mas codigo...
                if( DIA == "MIERCOLES" ){
                    System.out.println("Mejora de clima, saldra el sol");
                }else if( DIA == "JUEVES"){
                    System.out.println("Dia humedo y caluroso");
                }else if( DIA == "VIERNES"){
                    System.out.println("Dia super caluroso");
                }else{ 
                    //Por default
                    System.out.println("No se cumple ninguna de las anteriores");
                }
                //MAS CODIGO
            }
        }else{
            System.out.println("No es un dia lluvioso");
        }




    }
}
