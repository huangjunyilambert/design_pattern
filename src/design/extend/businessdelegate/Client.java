package design.extend.businessdelegate;

/**
 * @author huangjunyi
 * @date 2022/9/28 19:39:35
 */
public class Client {
    BusinessDelegate businessService;

    public Client(BusinessDelegate businessService) {
        this.businessService = businessService;
    }

    public void doTask() {
        businessService.doTask();
    }
}
