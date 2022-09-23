package design.patterns.strategy;

/**
 * @author huangjunyi
 * @date 2022/9/23 11:46:45
 */
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
