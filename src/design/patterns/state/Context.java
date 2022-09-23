package design.patterns.state;

/**
 * @author huangjunyi
 * @date 2022/9/23 11:29:56
 */
public class Context {
    private State state;

    public Context() {
        state = null;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
