package behavior.impl;

import behavior.QuackBehavior;

/**
 * @author chzhyu at 18-4-3 上午1:03
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("quack quack quack quack quack");
    }
}
