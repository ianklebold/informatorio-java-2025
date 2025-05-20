package paradigmas.poo.principios.herencia;

import paradigmas.poo.principios.abstraccion.Mensajero;
import paradigmas.poo.principios.abstraccion.Recargable;

public class Celular extends Mensajero implements Recargable {
    private boolean estaSinBateria;
    boolean esBuenaSenial;

    public Celular(String destino, boolean esBuenaSenial) {
        super( destino ); //Llamada al constructor padre
        this.esBuenaSenial = esBuenaSenial;
    }

    @Override
    public void enviarMensaje(String contenido) {
        if (esBuenaSenial) {
            System.out.println("Mensaje de celular : " + contenido + " hacia el destino " + destino);
        }else {
            System.out.println("Senial mala, cambie de ubicacion");
        }
    }

    @Override
    public void recargarBateria() {
        if(this.estaSinBateria){
            System.out.println("Recargando bateria");
            this.estaSinBateria = false;
        }
        System.out.println("Celular tiene bateria suficiente");

    }
}
