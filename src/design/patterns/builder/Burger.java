package design.patterns.builder;

/**
 * @author huangjunyi
 * @date 2022/9/19 17:13:55
 */
public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
