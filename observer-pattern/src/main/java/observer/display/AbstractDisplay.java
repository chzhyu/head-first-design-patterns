package observer.display;

import lombok.EqualsAndHashCode;

/**
 * @author chzhyu at 18-4-4 上午12:10
 */
@EqualsAndHashCode
public abstract class AbstractDisplay implements Display {

    @Override
    public abstract void update(float temperature, float humidity, float pressure);

}
