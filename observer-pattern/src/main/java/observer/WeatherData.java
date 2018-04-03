package observer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import observer.display.CurrentConditionDisplay;
import observer.display.ForecastDisplay;
import observer.display.StatisticsDisplay;

/**
 * @author chzhyu at 18-4-3 下午10:58
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WeatherData {
    private float temperature;

    private float humidity;

    private float pressure;

    private CurrentConditionDisplay currentConditionDisplay;
    private StatisticsDisplay statisticsDisplay;
    private ForecastDisplay forecastDisplay;


    public void measurementsChanged(){
        // my code here
        final float newTemperature = getTemperature();
        final float newHumidity = getHumidity();
        final float newPressure = getPressure();

        currentConditionDisplay.update(newTemperature,newHumidity,newPressure);
        statisticsDisplay.update(newTemperature,newHumidity,newPressure);
        forecastDisplay.update(newTemperature,newHumidity,newPressure);

    }



}
