package question_2;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Feed f = new Feed();
        // Observer nyTimes = new Observer() {
        // @Override
        // public void notify(String tweet) {
        // if (tweet != null && tweet.contains("money")) {
        // System.out.println("Breaking news in NY! " + tweet);
        // }
        // }

        // };
        // Observer nyTimes = (String tweet)-> {
        // if (tweet != null && tweet.contains("money")) {
        // System.out.println("Breaking news in NY! " + tweet);
        // }
        // };
        // f.registerObserver(nyTimes);

        // f.registerObserver((String tweet) -> {
        // if (tweet != null && tweet.contains("money")) {
        // System.out.println("Breaking news in NY! " + tweet);
        // }
        // });
        // f.registerObserver((String tweet) -> {
        // if (tweet != null && tweet.contains("queen")) {
        // System.out.println("Yet more news from London..." + tweet);
        // }
        // });
        // f.registerObserver(t -> {
        // if (t != null && t.contains("wine")) {
        // System.out.println("Today cheese, wine and news!" + t);
        // }
        // });
        // f.notifyObservers("The queen said her favourite book is Modern Java in
        // Action!");

        registerObserverWithFilter(f, tweet -> tweet.contains("money"), "Breaking news in NY!");
        registerObserverWithFilter(f, tweet -> tweet.contains("queen"), "Yet more news from London...");
        registerObserverWithFilter(f, tweet -> tweet.contains("wine"), "Today cheese, wine and news!");
        f.notifyObservers("The queen said her favourite book is Modern Java in Action!");

        // f.registerObserver(new NYTimes());
        // f.registerObserver(new Guardian());
        // f.registerObserver(new LeMonde());
        // f.notifyObservers("The queen said her favourite book is Modern Java in
        // Action!");
    }

    public static void registerObserverWithFilter(Feed f, Predicate<String> filter, String message) {
        f.registerObserver(tweet -> {
            if (tweet != null && filter.test(tweet)) {
                System.out.println(message + " " + tweet);
            }
        });
    }

}
