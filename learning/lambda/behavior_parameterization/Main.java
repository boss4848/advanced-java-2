package behavior_parameterization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(
                new Apple(Color.GREEN, 80),
                new Apple(Color.GREEN, 150),
                new Apple(Color.RED, 120));

        List<Apple> heavyApples = filterApples(inventory, new AppleHeavyWeightPredicate());

        List<Apple> result = filterApples(inventory, (Apple apple) -> Color.RED.equals(apple.getColor()));

    }

    // public static List<Apple> filterGreenApples(List<Apple> inventory) {
    // List<Apple> result = new ArrayList<>();
    // for (Apple apple : inventory) {
    // if (Color.GREEN.equals(apple.getColor())) {
    // result.add(apple);
    // }
    // }
    // return result;
    // }

    // Rewrite
    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate p) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }
    // Abstracing over a List type
}
