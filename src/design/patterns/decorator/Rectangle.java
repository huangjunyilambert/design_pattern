package design.patterns.decorator;

/**
 * @author huangjunyi
 * @date 2022/9/22 15:40:57
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
