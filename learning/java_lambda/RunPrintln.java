import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * RunPrintln
 */
public class RunPrintln {
    public static void main(String[] args) {
        // List<String> stringList = Arrays.asList("Anakin", "Luke", "Darth Vader", "Han Solo", "Stormtrooper", "Cherprang");
        // //lambda expression
        // stringList.forEach(it -> System.out.println(it));
        
        // //method reference
        // stringList.forEach(System.out::println);
        
        // Rewrite using method reference
        Consumer<String> printer = System.out::println;
        printer.accept("C1");
        System.out.println("C1");

        // Rewrite using a block-style lambda with generic type
        Consumer<String> blockPrinter = (String s) -> {
            System.out.println(s);
        };
        blockPrinter.accept("C2");
        System.out.println("C2");

        // Rewrite using a expression-style lambda with implied String type
        Consumer<String> expressionPrinter = s -> System.out.println(s);
        expressionPrinter.accept("C3");
        System.out.println("C3");

        // Use own functional interface
        // Rewrite using method reference
        StringPrinterIF<String> stringPrinter = System.out::println;
        stringPrinter.print("C4");
        
        // Rewrite using a block-style lambda with generic type
        StringPrinterIF<String> blockStringPrinter = (String s) -> {
            System.out.println(s);
        };
        blockStringPrinter.print("C5");

        // Rewrite using a expression-style lambda with implied String type
        StringPrinterIF<String> expressionStringPrinter = s -> System.out.println(s);
        expressionStringPrinter.print("C6");
    }
}
