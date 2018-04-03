package behavior.impl;

import behavior.FlyBehavior;

/**
 * @author chzhyu at 18-4-3 上午1:02
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("i am flying with wings");
    }
}
