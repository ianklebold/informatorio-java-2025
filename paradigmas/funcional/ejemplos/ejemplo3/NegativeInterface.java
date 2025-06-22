package ejemplo3;

@FunctionalInterface
public interface NegativeInterface<T> {
    boolean isNegative(T t);
}
