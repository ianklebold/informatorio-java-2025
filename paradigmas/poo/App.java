package paradigmas.poo;

import paradigmas.poo.principios.abstraccion.Computadora;
import paradigmas.poo.principios.abstraccion.Mensajero;
import paradigmas.poo.principios.abstraccion.Recargable;
import paradigmas.poo.principios.herencia.Celular;
import paradigmas.poo.principios.herencia.Paloma;
import paradigmas.poo.principios.herencia.Telegrafo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        List<Mensajero> mensajeros = new ArrayList();

        //Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el destino de una paloma");
        String destinoPaloma = sc.nextLine();
        Paloma paloma = new Paloma(destinoPaloma);

        System.out.println("Ingrese destino de telegrafo");
        String destinoTelegrafo = sc.nextLine();
        Telegrafo telegrafo = new Telegrafo(destinoTelegrafo);

        System.out.println("Ingrese destino de celular");
        String destinoCelular = sc.nextLine();

        System.out.println("La senial es buena? 1. Si 2.No");
        String senial = sc.nextLine();

        Celular celular = new Celular(
                destinoCelular,
                senial.equals("1")
        );

        sc.close();

        mensajeros.add( paloma );
        mensajeros.add( celular );
        mensajeros.add( telegrafo );

        //For each - Por cada
        for (Mensajero mensajero : mensajeros){
            //Polimorfismo
            mensajero.enviarMensaje("Alerta roja!!!");
        }

        List<Recargable> productosRecargable = new ArrayList();
        Computadora computadora = new Computadora(false, "Operacion completada");

        productosRecargable.add(computadora);
        productosRecargable.add(celular);
        for (Recargable recargable : productosRecargable){
            recargable.recargarBateria();
        }

    }
}
