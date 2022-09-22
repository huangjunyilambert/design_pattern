package design.patterns.criteria;

import java.util.List;

/**
 * @author huangjunyi
 * @date 2022/9/22 14:05:20
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);

}
