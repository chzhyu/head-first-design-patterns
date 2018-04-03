package duckcall;

import behavior.QuackBehavior;
import behavior.impl.Quack;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author chzhyu at 18-4-3 上午1:48
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Duckcall {
    private QuackBehavior quackBehavior = new Quack();


    public void call(){
        quackBehavior.quack();
    }
}
