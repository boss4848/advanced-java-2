package Q1;

@FunctionalInterface
public interface ValidationStrategy {
    boolean execute(String s);
}
