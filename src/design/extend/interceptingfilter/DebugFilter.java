package design.extend.interceptingfilter;

/**
 * @author huangjunyi
 * @date 2022/9/29 14:46:43
 */
public class DebugFilter implements Filter {
    public void execute(String request) {
        System.out.println("request log: " + request);
    }
}
