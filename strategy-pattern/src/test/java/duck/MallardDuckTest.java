package duck;

import behavior.impl.FlyRocketPowered;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author chzhyu at 18-4-3 上午1:15
 */
public class MallardDuckTest {
    private AbstractDuck duck;

    @Before
    public void setUp() {
        duck = new MallardDuck();
    }

    @Test
    public void performQuack() {
        duck.performQuack();
    }

    @Test
    public void performFly() {
        duck.performFly();
        duck.setFlyBehavior(new FlyRocketPowered());
        duck.performFly();
    }
}