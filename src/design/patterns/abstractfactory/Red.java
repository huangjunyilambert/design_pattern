package design.patterns.abstractfactory;

/**
 * @author huangjunyi
 * @date 2022/9/19 15:39:39
 */
public class Red implements Color{
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
