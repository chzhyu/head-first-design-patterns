package behavior.impl;

import behavior.FlyBehavior;

/**
 * @author chzhyu at 18-4-3 上午1:41
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket");
    }
}
