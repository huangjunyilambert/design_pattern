package design.extend.interceptingfilter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author huangjunyi
 * @date 2022/9/29 14:48:38
 */
public class FilterChain {
    private List<Filter> filters = new ArrayList<Filter>();
    private Target target;

    public void addFilter(Filter filter) {
        filters.add(filter);
    }

    public void execute(String request) {
        for (Filter filter : filters) {
            filter.execute(request);
        }
        target.execute(request);
    }

    public void setTarget(Target target) {
        this.target = target;
    }
}
