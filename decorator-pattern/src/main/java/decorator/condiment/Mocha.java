package decorator.condiment;

import components.Beverage;
import decorator.CondimentDecorator;

/**
 * @author chzhyu at 18-4-6 下午6:14
 */
public class Mocha extends CondimentDecorator {
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + .12;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
