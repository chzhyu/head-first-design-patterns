package observer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import observer.display.CurrentConditionDisplay;
import observer.display.DisplayElement;
import observer.display.ForecastDisplay;
import observer.display.StatisticsDisplay;

import java.util.Observable;

/**
 * @author chzhyu at 18-4-3 下午10:58
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuppressWarnings("all")
public class WeatherData extends Observable {
    private float temperature;

    private float humidity;

    private float pressure;

    private CurrentConditionDisplay currentConditionDisplay;
    private StatisticsDisplay statisticsDisplay;
    private ForecastDisplay forecastDisplay;


    private void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(10,10,10);
        weatherData.setMeasurements(11,11,11);
        weatherData.setMeasurements(12,12,12);
    }

    public void setMeasurements(float temperature, float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
