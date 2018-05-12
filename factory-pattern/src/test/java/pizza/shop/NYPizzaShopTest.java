package pizza.shop;

import lombok.experimental.var;
import org.hamcrest.core.IsInstanceOf;
import org.junit.Test;
import pizza.ingredient.Dough;
import pizza.ingredient.ThinCrustDough;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author chzhyu@126.com at 5/11/18 6:17 PM
 */
public class NYPizzaShopTest {

    @Test
    public void orderPizza() {
        final var shop = new NYPizzaShop();

        final var pizza = shop.orderPizza("cheese");

        assertThat(pizza).hasFieldOrPropertyWithValue("dough", new Dough());


    }
}