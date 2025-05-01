package paradigmas.imperativa;
public class OrganizacionDeCodigo{
    public static void main(String[] args) 
    { //Bloque de codigo                
      //Tipo nombreVariable;
      int valorEntero2 = 2; //Declaracion y asignacion
      int valorEntero3= 10, valorEntero5 = 10; //Declaracion de varias variables

      System.out.println(valorEntero2);

      System.out.print(valorEntero5);
      System.out.println(valorEntero3);
      
      char letra = 'a';
      float numeroFlotante = 2.1f;
      double numeroDouble = 2.1;
      boolean valorBooleano = true;
      long valor = 2;
      

      System.out.println(numeroFlotante + " Concatenacion " + letra + " " + numeroDouble);

      Long valorLong;
      Boolean valorWrapperBoolean;
      Character valorChar;
      Float valorFloat = 2.1f;

      String cadenaDeCaracter = "Hola soy una cadena";
      cadenaDeCaracter = cadenaDeCaracter + " " + " Otra cadena";

      

    }
}