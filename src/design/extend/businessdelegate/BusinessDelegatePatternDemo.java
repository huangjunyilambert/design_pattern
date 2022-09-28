package design.extend.businessdelegate;

/**
 * @author huangjunyi
 * @date 2022/9/28 19:40:01
 */
public class BusinessDelegatePatternDemo {
    public static void main(String[] args) {

        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType("EJB");

        Client client = new Client(businessDelegate);
        client.doTask();

        businessDelegate.setServiceType("JMS");
        client.doTask();
    }
}
