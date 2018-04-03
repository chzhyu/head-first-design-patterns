package observer;

import lombok.Data;
import observer.display.CurrentConditionDisplay;
import observer.display.Display;
import observer.display.ForecastDisplay;
import observer.display.StatisticsDisplay;

import java.util.HashSet;
import java.util.Set;

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

        displaySet.add(new CurrentConditionDisplay());
        displaySet.add(new StatisticsDisplay());
        displaySet.add(new ForecastDisplay());

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
