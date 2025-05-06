package paradigmas.estructurada;

public class CondicionalSegunHacer {
    public static void main(String[] args) {
        //Segun hacer = Switch Case

        /*
         * switch(value){
            case x : 
                //Código para valor == x
                break;
            case y :
                //Código para valor == y
            default:
                //Código para valor default
        }
         */

        String curso = "Python";

        final String MENSAJE_BIENVENIDA = "Bienvenido al curso de ";
        final String CURSO_DE_PYTHON = "Python";
        final String CURSO_DE_JAVA = "Java";
        final String CURSO_DE_TESTING = "Testing";


        switch (curso) {
            case CURSO_DE_PYTHON:
                System.out.println(MENSAJE_BIENVENIDA + CURSO_DE_PYTHON);
                break;
            case CURSO_DE_JAVA:
            case CURSO_DE_TESTING:
                System.out.println(MENSAJE_BIENVENIDA + CURSO_DE_JAVA + " y " + CURSO_DE_TESTING);
                break;
            default:
                System.out.println("Valor por default");
                break;
        }
        System.out.println("El programa continua");

        //Segundo ejemplo

        int calificacion1 = 10;
        int calificacion2 = 6;

        switch ((calificacion1 + calificacion2) / 2) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Haz desaprobado");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("Haz aprobado");
                break;        
            default:
                System.out.println("Calificacion invalida");
        }


        
    }
}
