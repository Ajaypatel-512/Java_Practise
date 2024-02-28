package core_java_made_easy.Collections_Framework.ComparableAndComparator;

import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
//        Set<Employee> emp = new TreeSet<>(new EmployeeNameCompare()); //based on name sorting
        Set<Employee> emp = new TreeSet<>();
        emp.add(new Employee(100,"obama"));
        emp.add(new Employee(300,"tony"));
        emp.add(new Employee(200,"steve"));
        emp.add(new Employee(500,"james"));

        for (Employee e : emp){
            System.out.println(e.id);
            System.out.println(e.name);
        }


    }
}
