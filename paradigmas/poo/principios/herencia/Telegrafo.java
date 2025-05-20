package paradigmas.poo.principios.herencia;

import paradigmas.poo.principios.abstraccion.Mensajero;

public class Telegrafo extends Mensajero {
    public Telegrafo(String destino) {
        super(destino);
    }

    @Override
    public void enviarMensaje(String contenido) {
        System.out.println("Telegrafo envia mensaje : " + contenido + " a su destino " + destino);
    }
}
