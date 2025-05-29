package paradigmas.poo.desafiov2.salidautils;

import paradigmas.poo.desafiov2.dominio.Jugador;
import paradigmas.poo.desafiov2.dominio.Mision;

public class ImpresoraResumen {
    public static void imprimir(Jugador jugador){
        int total = jugador.calcularTotal();
        System.out.println("\n\t *************************************************");
        System.out.println("\t\t  TOTALES FINALES");
        System.out.println("\n\t *************************************************");
        System.out.printf("%-40s%-30s%-30s%-30s%n", "MISION", "PUNTAJE", "PUNTAJE ACUMULADO", "TOTAL FINAL");

        int acumulado = 0;
        for(Mision mision : jugador.getMisiones()){
            acumulado += mision.getPuntaje();
            System.out.printf("%-40d%-30d%-30s%-30s%n",
                    mision.getNumero(),
                    mision.getPuntaje(),
                    acumulado,
                    ( (mision.getNumero() == jugador.getMisiones().size() )? "\t" + total: "" )
            );
        }
    }
}
