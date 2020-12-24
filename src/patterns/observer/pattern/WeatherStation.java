package patterns.observer.pattern;

public class WeatherStation {

    public static void main(String[] args) {
        Subject weatherData = new WeatherData();

        //initial display
        System.out.println("Initial Displays");
        Observer temperatureDisplay = new TemperatureDisplay(weatherData);
        Observer humidityDisplay = new HumidityDisplay(weatherData);

        //publishing latest measurements
        weatherData.setMeasurements(25.04f,5.02f,1.9f);
        System.out.println();

        //adding pressure display
        System.out.println("Added Pressure Display To Initial Displays");
        Observer pressureDisplay = new PressureDisplay(weatherData);

        //publishing latest measurements
        weatherData.setMeasurements(37.56f,12.77f,9.5f);
        System.out.println();

        //removing humidity display
        System.out.println("Removed Humidity Display From Displays");
        humidityDisplay.removeFromWeatherDataSubject();

        //publishing latest measurements
        weatherData.setMeasurements(42.01f,14.6f,8.34f);
    }
}
