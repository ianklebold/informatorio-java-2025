package paradigmas.poo.principios.abstraccion;

public class Computadora implements Recargable{
    private boolean estaSinBateria;
    private String resultadoDeOperacion;

    public Computadora(boolean estaSinBateria, String resultadoDeOperacion) {
        this.estaSinBateria = estaSinBateria;
        this.resultadoDeOperacion = resultadoDeOperacion;
    }

    public void solicitarCargaBateria(){
        System.out.println("Necesito recargar la bateria!");
    }

    public boolean getEstaSinBateria() {
        return estaSinBateria;
    }

    public void setEstaSinBateria(boolean estaSinBateria) {
        this.estaSinBateria = estaSinBateria;
    }

    public String getResultadoDeOperacion() {
        if(this.estaSinBateria){
            this.solicitarCargaBateria();
            return "\n Sin bateria - Cargando...";
        }
        return resultadoDeOperacion;
    }

    public void setResultadoDeOperacion(String resultadoDeOperacion) {
        this.resultadoDeOperacion = resultadoDeOperacion;
    }

    @Override
    public void recargarBateria() {
        this.estaSinBateria = false;
    }
}
