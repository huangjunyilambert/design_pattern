package design.extend.businessdelegate;

/**
 * @author huangjunyi
 * @date 2022/9/28 19:37:34
 */
public class EJBService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking EJB Service");
    }
}
