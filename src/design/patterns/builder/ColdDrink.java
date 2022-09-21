package design.patterns.builder;

/**
 * @author huangjunyi
 * @date 2022/9/19 17:17:41
 */
public abstract class ColdDrink implements Item{
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
