package core_java_made_easy.Java_13_14_Features.Records;

public class EmployeeDemo {

//    record Employee(String name, int sal);

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("john");
        employee.setSal(10000);

        System.out.println(employee);
        System.out.println(employee.getName());
        System.out.println(employee.getSal());


        RecordDemo employee1 = new RecordDemo("ajay",1000000);
        System.out.println(employee1);
        System.out.println(employee1.name());
        System.out.println(employee1.sal());
        System.out.println(employee1.hashCode());

        Employees e = new Employees("Ajay",51000);
        e.myMethod2();

    }
}
