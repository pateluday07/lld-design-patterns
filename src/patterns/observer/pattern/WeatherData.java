package patterns.observer.pattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private final List<Observer> observers = new ArrayList<>();
    private final DisplayData displayData = new DisplayData();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers
                .parallelStream()
                .forEachOrdered(observer -> observer.update(displayData));
    }

    private void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        displayData.setTemperature(temperature);
        displayData.setHumidity(humidity);
        displayData.setPressure(pressure);
        measurementsChanged();
    }
}
