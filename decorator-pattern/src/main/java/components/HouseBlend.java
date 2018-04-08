package components;

/**
 * @author chzhyu at 18-4-6 下午6:11
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }

}
