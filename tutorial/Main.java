import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 4, 5, 200, 20);
        // Consumer<Integer> cons = new Consumer<Integer>() {
        // @Override
        // public void accept(Integer t) {
        // System.out.println("cons: " + t);
        // }
        // };

        list.forEach(t -> System.out.println("cons: " + t));
        List<Integer> modifiedData = list.stream()
                .map((Integer n) -> n * 2)
                // .filter((Integer n) -> n == 8)
                .limit(3)
                .sorted()
                // .forEach((n) -> System.out.println(n));
                .collect(Collectors.toList());

        modifiedData.forEach(System.out::println);
    }
}
