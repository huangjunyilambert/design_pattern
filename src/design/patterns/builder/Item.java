package design.patterns.builder;

/**
 * @author huangjunyi
 * @date 2022/9/19 17:10:33
 */
public interface Item {
    public String name();
    public Packing packing();
    public float price();
}
