package paradigmas.poo.principios.herencia;

import paradigmas.poo.principios.abstraccion.Mensajero;

public class Paloma extends Mensajero {

    public Paloma(String destino) {
        super(destino);
    }

    @Override
    public void presentacion(){
        super.presentacion();

        //Codigo o implementacion propia de la clase
        System.out.println("Soy la paloma mensajera!");
    }

    @Override
    public void enviarMensaje(String contenido) {
        System.out.println("La paloma vuela hacia destino " + destino + " con el mensaje: " + contenido);
    }
}
