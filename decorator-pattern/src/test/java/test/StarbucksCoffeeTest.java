package test;

import components.Beverage;
import components.Espresso;
import decorator.condiment.Milk;
import decorator.condiment.Mocha;
import lombok.Data;
import lombok.experimental.var;
import org.junit.Test;
import size.Size;

/**
 * @author chzhyu at 18-4-6 下午6:16
 */
public class StarbucksCoffeeTest {
    @Test
    public void coffeeTest() {
        Beverage beverage = new Espresso();
        beverage.setSize(Size.VENTI);
        System.out.format("The description is %s, and the cost is $%g%n",
                beverage.getDescription(),beverage.cost());

        beverage = new Milk(beverage);
        System.out.format("The description is %s, and the cost is $%g%n",
                beverage.getDescription(),beverage.cost());

        beverage = new Mocha(beverage);
        System.out.format("The description is %s, and the cost is $%g%n",
                beverage.getDescription(),beverage.cost());

    }
}
