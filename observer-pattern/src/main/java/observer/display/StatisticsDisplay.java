package observer.display;

import observer.util.DisplayElement;
import observer.util.Observer;

/**
 * @author chzhyu at 18-4-3 下午11:18
 */
public class StatisticsDisplay implements DisplayElement,Observer {
    @Override
    public void update(float temperature, float humidity, float pressure) { }

    @Override
    public void display() {

    }
}
