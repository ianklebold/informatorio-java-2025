package interfaces.suppliers;

import java.time.LocalTime;
import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args) {
        Supplier<StringBuilder> supSb = () -> new StringBuilder(); //Clase de JAVA util para Strings
        System.out.println("Supplier SB: " + supSb.get().append("Ian"));

        Supplier<LocalTime> supTime = () -> LocalTime.now(); //Devolvemos una fecha
        System.out.println("Supplier Time: " + supTime.get());

        Supplier<Double> sRandom = () -> Math.random(); //Devolvemos un numero random.
        System.out.println("Random number : " + sRandom.get());

    }
}
