package paradigmas.estructurada.arreglos;

public class ArreglosUnidimensionales {

    public static void main(String[] args) {
        
        //Devolvemos la direccion de memoria del primer elemento
        int[] array1 = {1,2,3,4,5,6,7};
        int[] array2 = new int[7];

        System.out.println("El tamanio de un arreglo es : " + array1.length);
        System.out.println("Valor del elemento 1 : " + array1[0]);

        array1[0] = 100;
        System.out.println("El nuevo Valor del elemento 1 es : " + array1[0]);

        for (int i = 0; i < array1.length; i++) {
            System.out.println("Elemento : " + array1[i]);
        }

        for (int i = 0; i < array1.length; i = i + 2) {
            System.out.println(i);
            System.out.println("Elemento : " + array1[i]);
        }

    }
    
}

