package patterns.observer.pattern;

public class HumidityDisplay implements Observer, DisplayElement {

    private float humidity = 0.0f;
    private final Subject weatherData;

    public HumidityDisplay(Subject weatherData){
        this.weatherData = weatherData;
        this.weatherData.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("The current humidity is: " + humidity);
    }

    @Override
    public void update(DisplayData displayData) {
        this.humidity = displayData.getHumidity();
        display();
    }

    @Override
    public void removeFromWeatherDataSubject(){
        this.weatherData.removeObserver(this);
    }

}
