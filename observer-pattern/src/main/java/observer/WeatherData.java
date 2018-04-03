package observer;

import lombok.Data;
import observer.display.CurrentConditionAbatractAbstractDisplay;
import observer.display.AbstractDisplay;
import observer.display.Display;
import observer.display.ForecastAbatractAbstractDisplay;
import observer.display.StatisticsAbatractAbstractDisplay;

import java.util.HashSet;
import java.util.Set;
import java.util.TooManyListenersException;

/**
 * @author chzhyu at 18-4-3 下午10:58
 */
@Data
public class WeatherData {
    private float temperature;

    private float humidity;

    private float pressure;

    private Set<Display> displaySet;

    public WeatherData() {
        this(0f,0f,0f,null);
    }

    public WeatherData(float temperature, float humidity, float pressure, Set<Display> displaySet) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.displaySet = new HashSet<>();

        displaySet.add(new CurrentConditionAbatractAbstractDisplay());
        displaySet.add(new StatisticsAbatractAbstractDisplay());
        displaySet.add(new ForecastAbatractAbstractDisplay());

        displaySet.addAll(displaySet);
    }



    public void measurementsChanged(){
        // my code here
        final float newTemperature = getTemperature();
        final float newHumidity = getHumidity();
        final float newPressure = getPressure();

        update(newTemperature, newHumidity, newPressure);

    }

    private void update(float newTemperature, float newHumidity, float newPressure) {
        displaySet.forEach(display -> display.update(temperature,humidity,pressure));
    }


}
