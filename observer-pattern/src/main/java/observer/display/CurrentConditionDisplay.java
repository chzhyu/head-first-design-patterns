package observer.display;

import lombok.Data;
import observer.WeatherData;

import java.util.Observable;
import java.util.Observer;

/**
 * @author chzhyu at 18-4-3 下午11:18
 */
@Data
public class CurrentConditionDisplay implements DisplayElement,Observer {
    private float temperature;

    private float humidity;

    private float pressure;

    private Observable observable;

    public CurrentConditionDisplay(Observable weatherData) {
        this.observable = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            display();
        }
    }

    @Override
    public void display() {
        System.out.format("now the temperature is %g , the humidity is %g, the pressure is %g %% %n",
                temperature,humidity,pressure);
    }
}
