package ejemplo1;

public class SampleFIImpl {
    public static void main(String[] args) {
        //Antes de JAVA 8
        SampleFI i = new SampleFI(){
            @Override
            public void m() {
                System.out.println("Aqui se hace algo...");
            }
        };
        i.m();

        //Con JAVA 8 - Expresion lambda

        //Creacion de las funciones
        SampleFI lambdaI = () -> System.out.println("Lambda version 1");

        SampleFI lambdaI2 = () -> System.out.println("Lambda version 2");

        //Ejecucion
        lambdaI.m();
        lambdaI2.m();
    }
}
