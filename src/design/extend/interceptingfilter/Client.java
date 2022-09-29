package design.extend.interceptingfilter;

/**
 * @author huangjunyi
 * @date 2022/9/29 14:49:56
 */
public class Client {
    FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager) {
        this.filterManager = filterManager;
    }

    public void sendRequest(String request) {
        filterManager.filterRequest(request);
    }
}
