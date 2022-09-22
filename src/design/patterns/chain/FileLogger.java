package design.patterns.chain;

/**
 * @author huangjunyi
 * @date 2022/9/22 17:55:59
 */
public class FileLogger extends AbstractLogger {
    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
