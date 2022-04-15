package bonus.structural.pattern.filterorcriteria;

import java.util.List;

public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
