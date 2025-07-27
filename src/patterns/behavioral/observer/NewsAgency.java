package patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements Subject {

    private final List<Observer> observers = new ArrayList<>();


    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        observers
                .forEach(o -> o.update(message));
    }

    public void publishNews(String news) {
        System.out.println("Publishing news: " + news);
        notifyObservers(news);
    }
}
