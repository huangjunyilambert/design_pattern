package design.patterns.facade;

/**
 * @author huangjunyi
 * @date 2022/9/22 16:23:52
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
