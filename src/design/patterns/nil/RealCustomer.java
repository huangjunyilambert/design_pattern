package design.patterns.nil;

/**
 * @author huangjunyi
 * @date 2022/9/23 11:42:10
 */
public class RealCustomer extends AbstractCustomer {
    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isNil() {
        return false;
    }
}
