package pizza.factory;

import pizza.ingredient.*;

/**
 * @author chzhyu@126.com at 5/11/18 5:13 PM
 */
public interface PizzaIngredientFactory {

    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggies();

    Pepperoni createPepperoni();

    Clams createClam();

}
