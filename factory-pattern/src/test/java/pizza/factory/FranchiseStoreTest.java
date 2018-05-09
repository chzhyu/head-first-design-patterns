package pizza.factory;

import org.junit.Test;
import pizza.NYGreekPizza;
import pizza.Pizza;
import pizza.PizzaShop;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author chzhyu@126.com at 5/9/18 11:01 PM
 */
public class FranchiseStoreTest {
    @Test
    public void testNYPizzaFactory() throws Throwable {
        final SimplePizzaFactory nyPizzaFactory = new NYPizzaFactory();
        final PizzaShop pizzaShop = new PizzaShop(nyPizzaFactory);

        final Pizza greek = pizzaShop.orderPizza("greek");

        assertThat(greek).isInstanceOf(NYGreekPizza.class);


    }

}
