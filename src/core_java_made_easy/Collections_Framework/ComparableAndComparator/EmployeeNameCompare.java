package core_java_made_easy.Collections_Framework.ComparableAndComparator;

import java.util.Comparator;

public class EmployeeNameCompare implements Comparator<Employee> {


    @Override
    public int compare(Employee o1, Employee o2) {
        String s1 = o1.name;
        String s2 = o2.name;
        return s1.compareTo(s2);
    }
}
