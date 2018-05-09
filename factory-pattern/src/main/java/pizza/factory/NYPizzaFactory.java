package pizza.factory;

import pizza.*;

/**
 * @author chzhyu@126.com at 5/9/18 11:02 PM
 */
public class NYPizzaFactory extends SimplePizzaFactory {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;
        if ("chessse".equals(type)) {
            pizza = new ChessesPizza();
        } else if ("greek".equals(type)) {
            pizza = new NYGreekPizza();
        } else if ("pepperoni".equals(type)) {
            pizza = new PepperoniPizza();
        } else {
            throw new RuntimeException("wrong pizza type");
        }
        return pizza;

    }
}
