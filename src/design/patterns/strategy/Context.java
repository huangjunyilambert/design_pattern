package design.patterns.strategy;

/**
 * @author huangjunyi
 * @date 2022/9/23 11:49:49
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
