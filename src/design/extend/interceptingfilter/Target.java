package design.extend.interceptingfilter;

/**
 * @author huangjunyi
 * @date 2022/9/29 14:48:16
 */
public class Target {
    public void execute(String request) {
        System.out.println("Executing request: " + request);
    }
}
