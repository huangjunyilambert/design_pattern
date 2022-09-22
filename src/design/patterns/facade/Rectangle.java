package design.patterns.facade;

/**
 * @author huangjunyi
 * @date 2022/9/22 16:23:10
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
