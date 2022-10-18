package StreamApi.Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
    int empId;
    String empName;
    float salary;

    public Employee(int empId, String empName, float salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class FilterMap {
    public static void main(String[] args) {
//        List<Employee> emp1 = new ArrayList<>();
//        emp1.add(new Employee(101,"alex",20000));
//        emp1.add(new Employee(102,"tony",60000));
//        emp1.add(new Employee(103,"harry",64000));
//        emp1.add(new Employee(104,"joey",20240));
//        emp1.add(new Employee(105,"ross",30320));
//        emp1.add(new Employee(106,"plex",10030));
//        System.out.println(emp1.toString());


        List<Employee> emp1 = Arrays.asList(
                new Employee(101,"alex",20000),
                new Employee(102,"tony",60000),
                new Employee(103,"harry",64000),
                new Employee(104,"joey",20240),
                new Employee(105,"ross",30320),
                new Employee(106,"plex",10030)
        );
//        System.out.println(emp1.toString());

        // combination of filter and map
        List<Float> ans =  emp1.stream()
                .filter(i->i.salary>30000)
                .map(i->i.salary)
                .collect(Collectors.toList());
        System.out.println(ans);
    }
}
