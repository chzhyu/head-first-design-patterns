package pizza;

/**
 * @author chzhyu@126.com at 5/9/18 10:06 PM
 */
public abstract class PizzaShop {


    /**
     * the method to order pizza .
     *
     * @param type the type of pizza ,
     * @return the pizza the be eat
     */
    public final Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        if (pizza != null) {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }

        return pizza;
    }

    /**
     * method to create pizza , it should be implement by vary Franchises.
     *
     * @param type the type of pizza
     * @return the cooked pizza ,but still need to be prepared, baked, cut, boxed.
     */
    protected abstract Pizza createPizza(String type);

}
