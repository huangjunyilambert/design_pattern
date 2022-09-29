package design.extend.servicelocator;

/**
 * @author huangjunyi
 * @date 2022/9/29 14:59:07
 */
public class Service1 implements Service {
    public void execute() {
        System.out.println("Executing Service1");
    }

    @Override
    public String getName() {
        return "Service1";
    }
}
