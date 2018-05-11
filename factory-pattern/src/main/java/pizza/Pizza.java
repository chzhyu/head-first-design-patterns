package pizza;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

/**
 * @author chzhyu@126.com at 5/9/18 10:07 PM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Pizza {
    protected String name, dough, sauce;
    protected ArrayList toppings = new ArrayList();

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce ... ");
        for (Object topping : toppings) {
            System.out.println("   " + topping);

        }

    }

    public void bake() {
        System.out.println("Bake for 25 minutes");

    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");

    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");

    }
}
