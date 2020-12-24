package patterns.observer.pattern;

public interface Observer {

    void update(DisplayData displayData);

    void removeFromWeatherDataSubject();
}
