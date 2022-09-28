package design.extend.businessdelegate;

/**
 * @author huangjunyi
 * @date 2022/9/28 19:38:30
 */
public class BusinessLookUp {
    public BusinessService getBusinessService(String serviceType) {
        if (serviceType.equalsIgnoreCase("EJB")) {
            return new EJBService();
        } else {
            return new JMSService();
        }
    }
}
