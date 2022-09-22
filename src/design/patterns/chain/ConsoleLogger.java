package design.patterns.chain;

/**
 * @author huangjunyi
 * @date 2022/9/22 17:54:30
 */
public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
