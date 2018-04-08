package components;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import size.Size;

/**
 * @author chzhyu at 18-4-6 下午3:36
 */
public abstract class Beverage {
    protected String description = "Unknown Beverage";

    protected @Getter@Setter Size size = Size.GRANDE;

    public abstract double cost();

    public String getDescription(){
        return description;
    }
}
