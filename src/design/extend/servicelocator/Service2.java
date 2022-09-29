package design.extend.servicelocator;

/**
 * @author huangjunyi
 * @date 2022/9/29 14:59:34
 */
public class Service2 implements Service {
    public void execute() {
        System.out.println("Executing Service2");
    }

    @Override
    public String getName() {
        return "Service2";
    }
}
