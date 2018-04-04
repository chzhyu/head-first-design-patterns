package observer.display;

import lombok.Data;

import java.util.Observable;
import java.util.Observer;

/**
 * @author chzhyu at 18-4-3 下午11:18
 */
@Data
public class ForecastDisplay implements DisplayElement, Observer {
    private float temperature;

    private float humidity;

    private float pressure;

    private Observable observable;

    public ForecastDisplay(Observable weatherData) {
        this.observable = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {

    }

    @Override
    public void display() {

    }
}
