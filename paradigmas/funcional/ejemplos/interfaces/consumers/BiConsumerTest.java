package interfaces.consumers;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerTest {
    public static void main(String[] args) {
        Map<String,String> mapCapitalCities = new HashMap<>();

        //BiConsumer<T,U> es una interfaz funciona con un metodo abstracto
        // void accept(T t,U u)
        //Lo interesante del metodo .put es que devuelve un valor, pero no sera tenido en cuenta por el .accept(T,U)
        BiConsumer<String,String> biConsumer = (key, value) -> mapCapitalCities.put(key,value);
        biConsumer.accept("Dublin","Ireland");
        biConsumer.accept("Washington D.C","USA");

        System.out.println(mapCapitalCities);

        BiConsumer<String,String> mapPrint = (key,value) -> System.out.println(key + " is the capital of : "+value);
        mapCapitalCities.forEach(mapPrint);
    }
}
