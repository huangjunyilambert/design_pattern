package design.patterns.facade;

/**
 * @author huangjunyi
 * @date 2022/9/22 16:24:20
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
