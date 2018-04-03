package duck;

import behavior.FlyBehavior;
import behavior.QuackBehavior;
import behavior.impl.FlyWithWings;
import behavior.impl.Quack;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author chzhyu at 18-4-3 上午12:48
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class AbstractDuck {
    private QuackBehavior quackBehavior = new Quack();
    private FlyBehavior flyBehavior = new FlyWithWings();


    public void swin() {
        System.out.println("i am swimming");
    }

    public abstract void display();

    public void performQuack() {
        if (quackBehavior != null) {
            quackBehavior.quack();
        }
    }

    public void performFly() {
        if (flyBehavior != null) {
            flyBehavior.fly();
        }
    }
}
