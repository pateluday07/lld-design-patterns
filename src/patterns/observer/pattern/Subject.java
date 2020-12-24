package patterns.observer.pattern;

public interface Subject {

    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();

    void setMeasurements(float temperature, float humidity, float pressure);
}
