package design.patterns.builder;

/**
 * @author huangjunyi
 * @date 2022/9/19 17:20:03
 */
public class Coke extends ColdDrink{
    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
