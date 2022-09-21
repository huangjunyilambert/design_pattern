package design.patterns.abstractfactory;

/**
 * @author huangjunyi
 * @date 2022/9/19 15:40:16
 */
public class Green implements Color{
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
