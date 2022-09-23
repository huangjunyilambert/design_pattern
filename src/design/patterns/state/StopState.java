package design.patterns.state;

/**
 * @author huangjunyi
 * @date 2022/9/23 11:31:07
 */
public class StopState implements State {
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString() {
        return "Stop State";
    }
}
