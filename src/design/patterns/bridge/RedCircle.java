package design.patterns.bridge;/**
 * @author huangjunyi
 * @date 2022/9/22 10:05:42
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius + ", x: " + x + ", " + y + "]");
    }
}
