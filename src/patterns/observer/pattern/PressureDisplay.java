package patterns.observer.pattern;

public class PressureDisplay implements Observer, DisplayElement {

    private float pressure = 0.0f;
    private final Subject weatherData;

    public PressureDisplay(Subject weatherData){
        this.weatherData = weatherData;
        this.weatherData.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("The current pressure is: " + pressure);
    }

    @Override
    public void update(DisplayData displayData) {
        this.pressure = displayData.getPressure();
        display();
    }

    @Override
    public void removeFromWeatherDataSubject(){
        this.weatherData.removeObserver(this);
    }
}
