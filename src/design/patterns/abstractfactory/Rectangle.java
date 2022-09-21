package design.patterns.abstractfactory;


/**
 * @author huangjunyi
 * @date 2022/9/13 10:27:06
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
