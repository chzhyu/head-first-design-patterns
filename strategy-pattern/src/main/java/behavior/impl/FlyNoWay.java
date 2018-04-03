package behavior.impl;

import behavior.FlyBehavior;

/**
 * @author chzhyu at 18-4-3 上午1:03
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("i can't fly");
    }
}
