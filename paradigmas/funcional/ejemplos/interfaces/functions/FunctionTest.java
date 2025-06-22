package interfaces.functions;

import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        Function<String, Integer> fn2 = s -> s.length();
        System.out.printf("Function, length of the word is : " + fn2.apply("Moscow"));
    }
}
