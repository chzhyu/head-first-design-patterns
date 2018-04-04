package observer.util;

/**
 * @author chzhyu at 18-4-4 上午9:26
 */
public interface Observer {
    /**
     * the method to react to update
     * @param temperature temperature
     * @param humidity humidity
     * @param pressure pressure
     */
    void update(float temperature, float humidity, float pressure);
}
