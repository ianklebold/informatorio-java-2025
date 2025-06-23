package interfaces.functions;

import java.util.function.BiFunction;

public class BiFunctionTest {
    public static void main(String[] args) {
        BiFunction<String, String, Integer> biFn = (s1, s2) -> s1.length() + s2.length();
        System.out.printf("BiFunction, the sum of the two words length is : " + biFn.apply("William", "Shakespeare"));

        BiFunction<String, String, String> biFn2 = (s1, s2) -> s1.concat(s2);
        System.out.printf("BiFunction : concate of the two words : "+ biFn.apply("William", "Shakespeare"));
    }
}
