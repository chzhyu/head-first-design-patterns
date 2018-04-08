package decorator.condiment;

import components.Beverage;
import decorator.CondimentDecorator;
import size.Size;

/**
 * @author chzhyu at 18-4-6 下午3:40
 */
public class Milk extends CondimentDecorator {
    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", milk";
    }

    @Override
    public double cost() {
        double cost = .19;
        switch (beverage.getSize()) {
            case GRANDE:
                cost *=  1;
                break;
            case TALL:
                cost *= 1.5;
                break;
            case VENTI:
                cost *= 2;
                break;
            default:
        }

        return beverage.cost() + cost;
    }

    @Override
    public Size getSize() {
        return beverage.getSize();
    }
}
