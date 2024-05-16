import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

import abstracing.Predicate;

public class Main {
    public static void main(String[] args) {
        // Old concept we used class
        Printable c2 = new Cat();

        // Anonymous Inter Class
        Printable c = new Printable() {
            @Override
            public void print(String prefix) {
                System.out.println(prefix + "EIEI");
            }
        };

        // Printable cat = new Cat();
        Printable cat = (p) -> System.out.println(p + "meow");
        Printable dog = (p) -> System.out.println(p + "Buuu");

        c2.print("What ");
        c.print("GGG");
        cat.print("!!");
        dog.print("###");

        // Old concept
        // Need to create the class
        List<Integer> list = Arrays.asList(4, 5, 3, 5, 6);
        Consumer<Integer> cons = new ConsImp();
        list.forEach(cons);

        // Or anonymous class
        // But using like this its not allow because cant create instance from consumer
        // Consumer<Integer> cons2 = new Consumer<Integer>() {
        // };
        // But we can use anonymous class
        Consumer<Integer> cons2 = new Consumer<Integer>() {
            public void accept(Integer t) {
                System.out.println("cons " + t);
            };
        };
        list.forEach(cons2);

        // Using lambda
        System.out.println("Lambda");
        list.forEach((i) -> System.out.println(i));
        // Using method referrent
        System.out.println("Method ref");
        list.forEach(System.out::println);

        // Method referance
        List<String> names = Arrays.asList("Narvin", "Marnoj", "Boss", "Anto");
        // names.forEach(str -> System.out.println(str));
        Consumer<String> con = new Consumer<String>() {

            @Override
            public void accept(String t) {
                System.out.println(t);
            }

        };
        names.forEach(con);
        // Call by method (Pass function to a function)
        names.forEach(System.out::println);
        String str = "Passakorn";
        MyPrinter mp = new MyPrinter();

        // Anonymous class
        mp.print(str, new Parser() {
            @Override
            public String parse(String s) {
                return StringParser.convert(s);
            }
        });

        // Lambda
        mp.print(str, (String s) -> StringParser.convert(s));

        // Method referance
        mp.print(str, StringParser::convert);

        // Stream api

        // Before we use like this
        System.out.println();
        System.out.println("Steam API");
        List<Integer> values = new ArrayList<>();
        for (int j = 0; j <= 10; j++) {
            values.add(j);
        }
        Stream<Integer> filtered = values.stream().filter((n) -> n == 2).map((n) -> n * 2);
        Stream<Integer> multipyby2 = values.stream().map((n) -> n * 2);
        // multipyby2.filter((n) -> n == 10);
        values
                .stream()
                .sorted()
                .map(n -> n * 2)
                .forEach(System.out::println);
        System.out.println("FILTER");
        // filtered.forEach((n) -> System.out.println(n));
        // multipyby2.forEach((n) -> System.out.println(n));
        System.out.println("END");

        // Using for loop
        for (Integer integer : values) {
            System.out.println(integer);
        }
        // Using method ref
        values.forEach(System.out::println);

        // Stream
        // Stream has lots of methods to work with
        // Hadoop Bigdata
        // Can not reuse
        values.stream().forEach(System.out::println);
        // Instream has 2 types of method
        // Intermediate method -> filter(), map()
        // Terminate method -> findFirst(), forEach()
        values.stream().filter(i -> {
            System.out.println("hi");
            return true;
        }).findFirst().orElse(0);

        // Filter
        System.out.println("Filter");
        values.stream().filter(i -> {
            if (i == 2) {
                System.out.println(i);
            }
            return true;
        });

        // Parallel stream
        System.out.println("Parallel");
        values.parallelStream().forEach(System.out::println);

        // Functional Interface
        // Predicate -> boolean result (use for check something)
        Predicate<String> checkLength = s -> s.length() > 5;
        System.out.println(checkLength.test("WHatTT"));

        // Consumer -> no result (use for modifies data)

        // Function -> input and output
        // Supplier -> no input onlu supply

    }
}
