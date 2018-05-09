package pizza.factory;

import org.junit.Test;
import pizza.GreekPizza;
import pizza.Pizza;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author chzhyu@126.com at 5/9/18 10:52 PM
 */
public class SimplePizzaFactoryTest {
    private SimplePizzaFactory factory = new SimplePizzaFactory();

    @Test
    public void testCreatePizza() throws Throwable {
        final Pizza greek = factory.createPizza("greek");
        assertThat(greek).isInstanceOf(GreekPizza.class);

    }

}
