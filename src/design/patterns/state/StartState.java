package design.patterns.state;

/**
 * @author huangjunyi
 * @date 2022/9/23 11:30:31
 */
public class StartState implements State {
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    public String toString() {
        return "Start State";
    }
}
