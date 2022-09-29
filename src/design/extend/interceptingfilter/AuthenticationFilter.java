package design.extend.interceptingfilter;

/**
 * @author huangjunyi
 * @date 2022/9/29 14:46:15
 */
public class AuthenticationFilter implements Filter {
    public void execute(String request) {
        System.out.println("Authenticating request: " + request);
    }
}
