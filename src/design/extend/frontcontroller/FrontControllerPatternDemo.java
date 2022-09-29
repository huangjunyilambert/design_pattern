package design.extend.frontcontroller;

/**
 * @author huangjunyi
 * @date 2022/9/29 14:39:54
 */
public class FrontControllerPatternDemo {
    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");
    }
}
