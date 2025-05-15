package paradigmas.poo.primerclase;

//Clase en JAVA
public class Auto {
    //Atributos
    //[clasificador] tipo <nombreAtributo> [= valorInicial]
    private int cantidadDeRuedas;

    private boolean esElectrico = false;

    private String marca;

    private String modelo;

    private String color;

    Auto(){
        this.cantidadDeRuedas = 0;
        this.esElectrico = false;
        this.marca = "";
        this.modelo = "";
        this.color = "";
    }

    Auto(int cantidadDeRuedas, boolean esElectrico, String marca, String modelo, String color){

        this.cantidadDeRuedas = cantidadDeRuedas;
        this.esElectrico = esElectrico;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;

    }

    Auto(int cantidadDeRuedas, boolean esElectrico){

        this.cantidadDeRuedas = cantidadDeRuedas;
        this.esElectrico = esElectrico;
        this.marca = "";
        this.modelo = "";
        this.color = "";

    }

    Auto(String modelo, boolean esElectrico){

        this.cantidadDeRuedas = 0;
        this.esElectrico = esElectrico;
        this.marca = "";
        this.modelo = modelo;
        this.color = "";

    }


    //Metodos
    //[clasificador] [tipoDeRetorno] nombreDelMetodo([<expresiones>])){}
    //Parametros Tipo nombreParametro, Tipo nombreParametro....
    public void mostrarInformacion(String parametro1, int parametro2){
        System.out.println(parametro1);
        System.out.println(parametro2);



        System.out.print( this.getCantidadDeRuedas() );
        System.out.print( this.getColor() );
        System.out.print( this.getMarca() );
        System.out.print( this.getModelo() );
        System.out.print( this.getEsElectrico() );
    }

    //Setters
    public void setColor(String color){
        this.color = color;
    }

    public void setCantidadDeRuedas(int cantidadDeRuedas){
        this.cantidadDeRuedas = cantidadDeRuedas;
    }

    public void setEsElectrico(boolean esElectrico){
        this.esElectrico = esElectrico;
    }

    public void setMarca(String marca){

        if( marca == null ){
            this.marca = "No tiene marca";
        }else{
            this.marca = marca;
        }

    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    //Getters
    public String getColor(){
        return this.color;
    }
    public String getMarca(){
        return this.marca;
    }
    public String getModelo(){
        return this.modelo;
    }
    public int getCantidadDeRuedas(){
        return this.cantidadDeRuedas;
    }

    public boolean getEsElectrico(){
        return this.esElectrico;
    }


}
