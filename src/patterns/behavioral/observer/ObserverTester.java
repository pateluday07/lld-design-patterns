package patterns.behavioral.observer;

public class ObserverTester {

    public static void main(String[] args) {
        Subject newsAgency = new NewsAgency();

        Observer reader1 = new NewsReader("Alice");
        Observer reader2 = new NewsReader("Bob");

        newsAgency.registerObserver(reader1);
        newsAgency.registerObserver(reader2);

        newsAgency.notifyObservers("Breaking News: Observer Pattern in Action!");

        newsAgency.removeObserver(reader1);

        newsAgency.notifyObservers("Update: Observer Pattern Example Continued!");
    }
}
