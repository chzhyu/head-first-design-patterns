package observer.display;

import lombok.Data;
import observer.util.DisplayElement;
import observer.util.Observer;
import observer.util.Subject;

/**
 * @author chzhyu at 18-4-3 下午11:18
 */
@Data
public class CurrentConditionDisplay implements DisplayElement,Observer {

    private float temperature;

    private float humidity;

    private Subject weatherDate;

    public CurrentConditionDisplay(Subject weatherDate) {
        this.weatherDate = weatherDate;
        weatherDate.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.format("The CurrentCondition : temperature is %g 度，and the humidity is %g %% %n",
                temperature, humidity);
    }
}
