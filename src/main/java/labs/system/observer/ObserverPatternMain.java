package labs.system.observer;

import labs.system.observer.display.CurrentContiditionDisplay;
import labs.system.observer.display.ForecastDisplay;

public class ObserverPatternMain {
    public static void main(String args[]) {
        WeatherData weatherData = new WeatherData();

        CurrentContiditionDisplay CurrentContiditionDisplay = new CurrentContiditionDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(18, 5, -5);
    }
}
