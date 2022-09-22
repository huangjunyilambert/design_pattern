package design.patterns.bridge;/**
 * @author huangjunyi
 * @date 2022/9/22 10:07:01
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
