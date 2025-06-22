package interfaces.streams;

import java.util.Arrays;
import java.util.List;

public class StreamTest {
    public static void main(String[] args) {
        List<String> nombres = Arrays.asList(
                "Lionel Messi",
                "Cristiano Ronaldo",
                "La brujita Veron",
                "Luis Suárez",
                "Luka Modric",
                "Arjen Robben",
                "Andrés Iniesta"
        );

        nombres.stream()  // 1. stream() - genera un Stream a partir de la colección
                .filter(nombre -> nombre.startsWith("L")) // 2. filter() -  Predicate<String> → boolean test(T t)
                .map(nombre -> nombre.length())  // 3. map() - Function<String, Integer>: transforma cada nombre a su longitud
                .peek(longitud -> System.out.println("Longitud calculada: " + longitud))// 4. peek() - Consumer<Integer> → R apply(T t)
                .filter(longitud -> longitud > 12) // 5. filter() - Predicate<Integer> Predicate<String> → boolean test(T t)
                .sorted((a, b) -> b - a) // 6. sorted() - Comparator<T> → int compare(T o1, T o2)
                .forEach(resultado -> System.out.println("Resultado final: " + resultado)); // 7. forEach() - Consumer<Integer>:  void accept(T t)
    }
}
