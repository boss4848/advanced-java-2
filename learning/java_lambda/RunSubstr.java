import java.util.function.BiFunction;

public class RunSubstr {
    public static void main(String[] args) {
        // Lambda expression
        BiFunction<String, Integer, String> substr1 = (s, i) -> s.substring(i);
        System.out.println(substr1.apply("Hello, World!", 7));

        // Method reference
        BiFunction<String, Integer, String> substr2 = String::substring;
        System.out.println(substr2.apply("Hello, World!", 7));

        // Use own functional interface
        // Lambda expression
        StringSubstringIF substr3 = (s, i) -> s.substring(i);
        System.out.println(substr3.substr("Hello, World!", 7));
        
        // Method reference
        StringSubstringIF substr4 = String::substring;
        System.out.println(substr4.substr("Hello, World!", 7));
    }
}

@FunctionalInterface
interface StringSubstringIF {
    String substr(String s, int i);
}