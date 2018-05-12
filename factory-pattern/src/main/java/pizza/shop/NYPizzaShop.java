package pizza.shop;

import pizza.CheesePizza;
import pizza.Pizza;
import pizza.factory.NYPizzaIngredientFactory;
import pizza.factory.PizzaIngredientFactory;

/**
 * @author chzhyu@126.com at 5/11/18 5:53 PM
 */
public class NYPizzaShop extends PizzaShop {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        final PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if ("cheese".equals(type)) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if ("veggie".equals(type)) {
            // ...
        }


        return pizza;

    }
}
