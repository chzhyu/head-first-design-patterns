package pizza;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pizza.ingredient.*;

import java.util.ArrayList;

/**
 * @author chzhyu@126.com at 5/9/18 10:07 PM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;

    /**
     * We should make the prepare method abstract
     * because this is where we are going to collect the
     * ingredients needed for the pizza, which of course
     * will come from the ingredient factory.
     */
    public abstract void prepare();

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
