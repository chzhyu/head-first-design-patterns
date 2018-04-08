package decorator;

import components.Beverage;

/**
 * @author chzhyu at 18-4-6 下午3:38
 */
public abstract class CondimentDecorator extends Beverage {
    private double cost;

    @Override
    public abstract String getDescription();
}
