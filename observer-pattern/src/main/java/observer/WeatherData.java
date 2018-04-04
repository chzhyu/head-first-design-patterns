package observer;

import lombok.Data;
import observer.display.CurrentConditionDisplay;
import observer.display.HeadIndexDisplay;
import observer.util.Observer;
import observer.util.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chzhyu at 18-4-3 下午10:58
 */
@Data
public class WeatherData implements Subject {
    private float temperature;

    private float humidity;

    private float pressure;

    private List<Observer> observers;

    public WeatherData() {
        this(0f,0f,0f,new ArrayList<>());
    }

    public WeatherData(float temperature, float humidity, float pressure, List<Observer> displayElementList) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.observers = displayElementList;
    }



    public void measurementsChanged(){
        // my code here
        notifyObservers();
    }

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        new CurrentConditionDisplay(weatherData);

        new HeadIndexDisplay(weatherData);
        weatherData.setMeasurements(10,20,30);
        weatherData.setMeasurements(11,21,31);
        weatherData.setMeasurements(12,22,32);
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    @Override
    public void registerObserver(Observer observer) {
        if (observer != null && observers != null && !observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        if (observer != null && observers != null && !observers.contains(observer)) {
            int i = observers.indexOf(observer);
            if (i >= 0) {
                observers.remove(observer);
            }
        }
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(temperature,humidity,pressure));
    }
}
