package core_java_made_easy.Java_13_14_Features.Records;

public record Employees(String name, int sal) {

    static int id;
    public static void myMethod(){
        System.out.println("This is a static method");
    }

    public void myMethod2(){
        System.out.println("This is a instance method");
        System.out.println(this.name);
        System.out.println(this.sal);
    }

}
