package design.patterns.nil;

/**
 * @author huangjunyi
 * @date 2022/9/23 11:42:37
 */
public class NullCustomer extends AbstractCustomer {
    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }

    @Override
    public boolean isNil() {
        return true;
    }
}
