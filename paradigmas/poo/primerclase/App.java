package paradigmas.poo.primerclase;

public class App {
    public static void main(String[] args) {
        //<NombreClase> estaEsUnaVariable = new<NombreClase>([<expresiones>]);
        Auto auto = new Auto(); //Instanciar el objeto
        System.out.println(auto); // Direccion de memoria

        //Operador . - Me permite acceder a metodos y atributos.
        //        auto.cantidadDeRuedas = 4;
        //        auto.color = "Gris";
        //        auto.marca = "X";
        //        auto.modelo = "XX";

        //        System.out.println( auto.cantidadDeRuedas );
        //        System.out.println( auto.color );
        //        System.out.println( auto.marca );
        //        System.out.println( auto.modelo );
        //        System.out.println( auto.esElectrico );

        auto.setCantidadDeRuedas( 4 );
        auto.setColor("Gris");
        auto.setMarca("X");
        auto.setModelo("XX");
        auto.setEsElectrico(true);


        System.out.println( auto.getEsElectrico() );
        System.out.println( auto.getColor() );
        System.out.println( auto.getMarca() );
        System.out.println( auto.getModelo() );
        System.out.println( auto.getCantidadDeRuedas() );

        //int cantidadDeRuedas, boolean esElectrico, String marca, String modelo, String color
        Auto auto2 = new Auto(4,false,"X","XX","AZUL");
        Auto auto3 = new Auto(4,true);
        Auto auto4 = new Auto("X",false);

        auto2.mostrarInformacion("Info del auto", 2);
        auto3.mostrarInformacion("Info del auto", 3);
        auto4.mostrarInformacion("Info del auto", 4);


    }
}
