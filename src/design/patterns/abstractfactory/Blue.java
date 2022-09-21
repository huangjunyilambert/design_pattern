package design.patterns.abstractfactory;

/**
 * @author huangjunyi
 * @date 2022/9/19 15:40:41
 */
public class Blue implements Color{
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
