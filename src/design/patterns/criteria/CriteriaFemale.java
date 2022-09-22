package design.patterns.criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * @author huangjunyi
 * @date 2022/9/22 14:06:32
 */
public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("FEMALE")) {
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
