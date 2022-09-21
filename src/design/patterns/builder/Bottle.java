package design.patterns.builder;

/**
 * @author huangjunyi
 * @date 2022/9/19 17:11:56
 */
public class Bottle implements Packing{
    @Override
    public String pack() {
        return "Bottle";
    }
}
