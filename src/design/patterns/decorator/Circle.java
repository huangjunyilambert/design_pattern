package design.patterns.decorator;

/**
 * @author huangjunyi
 * @date 2022/9/22 15:41:36
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
