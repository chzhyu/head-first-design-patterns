package pizza.nystyle;

import org.junit.Test;
import pizza.Pizza;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author chzhyu@126.com at 5/10/18 3:30 PM
 */
public class NYStylePizzaShopTest {



    @Test
    public void createPizza() {
        final NYStylePizzaShop shop = new NYStylePizzaShop();

        final Pizza greek = shop.orderPizza("greek");
        assertThat(greek).isInstanceOf(NYGreekPizza.class);


    }

    @Test
    public void testCreateCheesePizza() throws Throwable {
        final NYStylePizzaShop shop = new NYStylePizzaShop();

        final Pizza cheese = shop.orderPizza("cheese");

        assertThat(cheese).isInstanceOf(NYCheesePizza.class);


    }
}