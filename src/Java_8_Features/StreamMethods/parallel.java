package Java_8_Features.StreamMethods;

import java.util.Arrays;
import java.util.List;

class Student {
    int marks;
    String name;

    public Student(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }
}


public class parallel {
    public static void main(String[] args) {
        List<Student> student1 = Arrays.asList(
                new Student(82, "alex"),
                new Student(12, "phobe"),
                new Student(93, "joey"),
                new Student(55, "joey")
        );

        student1.stream().filter(s->s.marks>=80).limit(1).forEach(student -> System.out.println(student.getMarks()+" "+student.getName()));



        //using parallel stream
        student1.parallelStream().filter(s->s.marks>=80).limit(1).forEach(student -> System.out.println(student.getMarks()+" "+student.getName()));

        //convert stream to parallel strem
        student1.stream().parallel().filter(s->s.marks>=80).limit(1).forEach(student -> System.out.println(student.getMarks()+" "+student.getName()));


    }
}
