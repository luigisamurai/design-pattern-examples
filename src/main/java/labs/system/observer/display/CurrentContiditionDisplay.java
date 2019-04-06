package labs.system.observer.display;

import labs.system.observer.interfaces.DisplayElement;
import labs.system.observer.interfaces.Observer;
import labs.system.observer.interfaces.Subject;

public class CurrentContiditionDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject subject;

    public CurrentContiditionDisplay(Subject subject) {
        this.subject = subject;
        this.subject.registerObserver(this);
    }


    @Override
    public void display() {
        String message = String.format(
                "Temperature: %s\tHumidity: %s \tPressure: %s",
                this.temperature,
                this.humidity,
                this.pressure
        );

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
