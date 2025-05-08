package paradigmas.estructurada.arreglos;

public class ArreglosBidimensionales {
    public static void main(String[] args) {
        int[][] array1 = {
            {1, 2, 3},
            {1, 2}
        };

        String[][] array2 = {
            {"a"},
            {"x", "y", "z"}
        };

        
        for (int i = 0; i < array1.length; i++) {
            // Primer bucle for recorre las filas
            for (int j = 0; j < array1[i].length; j++) {
                // Segundo bucle for recorre las columnas
                System.out.println(array1[i][j]);
            }
        }

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.println(array2[i][j]);
            }
        }
        
    }
}
