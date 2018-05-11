package pizza.nystyle;

import pizza.Pizza;
import pizza.PizzaShop;

/**
 * @author chzhyu@126.com at 5/9/18 11:24 PM
 */
@SuppressWarnings("all")
public class NYStylePizzaShop extends PizzaShop {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza;
        if ("cheese".equals(type)) {
            pizza = new NYCheesePizza();
        } else if ("greek".equals(type)) {
            pizza = new NYGreekPizza();
        } else if ("pepperoni".equals(type)) {
            pizza = new NYPepperoniPizza();
        } else {
            throw new RuntimeException("wrong pizza type");
        }
        return pizza;
    }
}
