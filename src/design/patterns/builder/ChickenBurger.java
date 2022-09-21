package design.patterns.builder;

/**
 * @author huangjunyi
 * @date 2022/9/19 17:19:35
 */
public class ChickenBurger extends Burger{
    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
