package interfaces.predicates;

import java.util.function.BiPredicate;

public class BiPredicateTest {
    public static void main(String[] args) {
        //Cuando el argumento es mas de 1, se los debe encerrar entre ()
        BiPredicate<String,Integer> biStr = (s, u) -> s.length() == u;



        System.out.println(biStr.test("Vacation City",8));//false
    }
}
