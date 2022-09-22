package design.patterns.criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * @author huangjunyi
 * @date 2022/9/22 14:05:57
 */
public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("MALE")) {
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
