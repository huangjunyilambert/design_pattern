package design.patterns.builder;

/**
 * @author huangjunyi
 * @date 2022/9/19 17:20:30
 */
public class Pepsi extends ColdDrink{
    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
