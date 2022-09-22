package design.patterns.chain;

/**
 * @author huangjunyi
 * @date 2022/9/22 17:55:29
 */
public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
