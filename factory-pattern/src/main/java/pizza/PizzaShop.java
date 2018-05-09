package pizza;

import pizza.factory.SimplePizzaFactory;

/**
 * @author chzhyu@126.com at 5/9/18 10:06 PM
 */
public class PizzaShop {

    private final SimplePizzaFactory factory;

    public PizzaShop(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public PizzaShop() {
        factory = new SimplePizzaFactory();
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = factory.createPizza(type);

        if (pizza != null) {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }

        return pizza;
    }

}
