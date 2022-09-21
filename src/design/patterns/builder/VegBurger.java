package design.patterns.builder;

/**
 * @author huangjunyi
 * @date 2022/9/19 17:18:33
 */
public class VegBurger extends Burger{
    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
