package question_2;

public interface Subject {
    void registerObserver(Observer o);

    void notifyObservers(String tweet);
}
