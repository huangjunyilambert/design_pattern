package design.patterns.observer;

/**
 * @author huangjunyi
 * @date 2022/9/23 09:55:38
 */
public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}
