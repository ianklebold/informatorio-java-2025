package interfaces.predicates;

import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {

        int x = 7;

        Predicate<Integer> operacionImplementada = i -> i % 2 == 0;
        System.out.println("Is : " + x + " even? " + check(x,operacionImplementada));

        x = 8;
        System.out.println("Is : " + x + " even? " + check(x,i -> i % 2 == 0));

        String nombre = "Mr. Ian";
        System.out.println("Is : " + nombre + " start with Mr.? " + check(nombre,name -> name.startsWith("Mr. ")));

    }

    public static <T> boolean check(T t, Predicate<T> lambda){
        return lambda.test(t);
    }
}
