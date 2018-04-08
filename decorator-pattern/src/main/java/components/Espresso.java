package components;

/**
 * @author chzhyu at 18-4-6 下午5:49
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
