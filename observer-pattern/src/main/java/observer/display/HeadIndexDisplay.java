package observer.display;

import lombok.Data;
import observer.WeatherData;
import observer.util.DisplayElement;
import observer.util.Observer;

/**
 * @author chzhyu at 18-4-4 上午10:21
 */
@Data
public class HeadIndexDisplay implements Observer,DisplayElement {
    private float temperature;

    private float humidity;

    private float pressure;

    private WeatherData weatherData;

    public HeadIndexDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("it is a HeadIndexDisplay");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
