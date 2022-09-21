package design.patterns.prototype;

/**
 * @author huangjunyi
 * @date 2022/9/21 18:24:59
 */
public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
