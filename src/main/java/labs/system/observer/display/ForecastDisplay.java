package labs.system.observer.display;

import labs.system.observer.interfaces.DisplayElement;
import labs.system.observer.interfaces.Observer;
import labs.system.observer.interfaces.Subject;

public class ForecastDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject subject;

    public ForecastDisplay(Subject subject) {
        this.subject = subject;
        this.subject.registerObserver(this);
    }


    @Override
    public void display() {
        String message;

        if (this.temperature < 16) {
            message = "Hoy hara frio";
        } else if(this.temperature < 28) {
            message = "Hoy sera tibio";
        } else {
            message = "Hoy sera caliente";
        }

        System.out.println(message);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        this.display();
    }
}
