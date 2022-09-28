package design.extend.businessdelegate;

/**
 * @author huangjunyi
 * @date 2022/9/28 19:37:56
 */
public class JMSService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking JMS Service");
    }
}
