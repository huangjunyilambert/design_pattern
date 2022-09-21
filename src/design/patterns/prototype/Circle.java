package design.patterns.prototype;

/**
 * @author huangjunyi
 * @date 2022/9/21 18:26:18
 */
public class Circle extends Shape {
    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
