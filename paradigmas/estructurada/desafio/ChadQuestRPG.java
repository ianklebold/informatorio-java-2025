package paradigmas.estructurada.desafio;

public class ChadQuestRPG {
    public static void main(String[] args) {
        
        int[] puntosPorCadaMision = new int[5];

        int total = 0;

        puntosPorCadaMision[0] = 50;
        puntosPorCadaMision[1] = 80;
        puntosPorCadaMision[2] = 60;
        puntosPorCadaMision[3] = 100;
        puntosPorCadaMision[4] = 70;
        int maxPuntosMision = puntosPorCadaMision[0];
        int menorPuntosMision = puntosPorCadaMision[0];

        int posMax = 0;
        int posMin = 0;
        boolean esMisionFallida = false;

        for (int i = 0; i < 5; i++) {
            total += puntosPorCadaMision[i];
        }

        for (int i = 1; i < 5; i++) {
            if (puntosPorCadaMision[i] > maxPuntosMision){
                maxPuntosMision = puntosPorCadaMision[i];
                posMax = i;
            }
        }

        for (int i = 1; i < 5; i++) {
            if (puntosPorCadaMision[i]< menorPuntosMision){
                menorPuntosMision = puntosPorCadaMision[i];
                posMin = i;
            }
        }

        for (int i = 0; i < puntosPorCadaMision.length; i++) {
            if (puntosPorCadaMision[i] == 0){
                esMisionFallida = true;
            }
        }

        if(total>300){
                System.out.println("¡Felicidades! Sos un verdadero Chad del RPG ");
        } else {
                System.out.println("Te falta entrenamiento, joven aprendiz...");
        }

        System.out.println("Puntos acumulados : " + total);
        System.out.println("La mision que mejor rendimiento tuvo es la mision NÂ° "+(posMax+1)+" con "+maxPuntosMision+" puntos");

        if (esMisionFallida){
            System.out.println("Fallaste al menos una misión. Que el backend te tenga piedad...");
        }
        if (maxPuntosMision - menorPuntosMision < 20){
            System.out.println("¡Ejecución constante! Sos el sueño de un arquitecto de software.");
        }

        //printf
        /*
         * Mostrar un encabezado en donde se listen la misión, el puntaje, el puntaje
            acumulado y luego el total final
         */
        System.out.println("\n\t *************************************************");
        System.out.println("\t\t  TOTALES FINALES");
        System.out.println("\n\t *************************************************");

        System.out.printf("%-40s%-30s%-30s%-30s%n", "MISION", "PUNTAJE", "PUNTAJE ACUMULADO", "TOTAL FINAL");
        for (int i = 0; i < puntosPorCadaMision.length; i++) {
            System.out.printf("%-40d%-30d%-30s%-30s%n", 
            i+1, 
            puntosPorCadaMision[i], 
            "PUNTAJE ACUMULADO", 
            (i == puntosPorCadaMision.length - 1)? "\t" + total: ""
            );
        }

    }
}
