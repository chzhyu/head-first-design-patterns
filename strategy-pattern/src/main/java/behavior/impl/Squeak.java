package behavior.impl;

import behavior.QuackBehavior;

/**
 * @author chzhyu at 18-4-3 上午1:04
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("squeak squeak squeak squeak squeak squeak");
    }
}
