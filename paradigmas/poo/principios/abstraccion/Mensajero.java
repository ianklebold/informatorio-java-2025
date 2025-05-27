package paradigmas.poo.principios.abstraccion;

public abstract class Mensajero {
    protected String destino;
    protected Origen origen;

    public Mensajero(String destino) {
        this.destino = destino;
    }

    public void presentacion(){
        System.out.println( "Soy la presentacion por default de un Mensajero" );
    }

    public abstract void enviarMensaje(String contenido); //Abstracto

}
