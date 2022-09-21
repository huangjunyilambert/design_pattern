package design.patterns.abstractfactory;


/**
 * @author huangjunyi
 * @date 2022/9/13 10:30:58
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
