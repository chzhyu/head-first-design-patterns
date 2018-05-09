package pizza.factory;

import pizza.ChessesPizza;
import pizza.GreekPizza;
import pizza.PepperoniPizza;
import pizza.Pizza;

/**
 * @author chzhyu@126.com at 5/9/18 10:21 PM
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza;
        if ("chessse".equals(type)) {
            pizza = new ChessesPizza();
        } else if ("greek".equals(type)) {
            pizza = new GreekPizza();
        } else if ("pepperoni".equals(type)) {
            pizza = new PepperoniPizza();
        } else {
            throw new RuntimeException("wrong pizza type");
        }
        return pizza;
    }

}
