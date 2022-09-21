package design.patterns.abstractfactory;

/**
 * @author huangjunyi
 * @date 2022/9/19 15:41:40
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);

}
