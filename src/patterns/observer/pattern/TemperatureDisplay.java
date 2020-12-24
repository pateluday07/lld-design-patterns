package patterns.observer.pattern;

public class TemperatureDisplay implements Observer, DisplayElement {

    private float temperature = 0.0f;
    private final Subject weatherData;

    public TemperatureDisplay(Subject weatherData){
        this.weatherData = weatherData;
        this.weatherData.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("The current temperature is: " + temperature + " Celsius");
    }

    @Override
    public void update(DisplayData displayData) {
        this.temperature = displayData.getTemperature();
        display();
    }

    @Override
    public void removeFromWeatherDataSubject(){
        this.weatherData.removeObserver(this);
    }
}
