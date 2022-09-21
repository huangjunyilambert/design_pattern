package design.patterns.abstractfactory;


/**
 * @author huangjunyi
 * @date 2022/9/13 10:27:59
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
