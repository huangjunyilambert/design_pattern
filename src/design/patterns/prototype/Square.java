package design.patterns.prototype;

/**
 * @author huangjunyi
 * @date 2022/9/21 18:25:41
 */
public class Square extends Shape {
    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
