package core_java_made_easy.Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student{
    int rollNo;
    String name;
    char grade;

    public Student(int rollNo, String name, char grade) {
        this.rollNo = rollNo;
        this.name = name;
        this.grade = grade;
    }
}

public class CombineCollection {
    public static void main(String[] args) {

        List<Student> student1 = new ArrayList<>();
        student1.add(new Student(101, "alex", 'A'));
        student1.add(new Student(102, "phobe", 'D'));
        student1.add(new Student(103, "joey", 'B'));

        List<Student> student2 = new ArrayList<>();
        student2.add(new Student(104, "ross", 'C'));
        student2.add(new Student(105, "harry", 'A'));
        student2.add(new Student(106, "steve", 'A'));

        List<List<Student>> studentList = Arrays.asList(student1,student2);

        List<Integer> studentRoll = studentList.stream().flatMap(n->n.stream().map(m->m.rollNo)).collect(Collectors.toList());
        System.out.println(studentRoll);

        List<String> studentName = studentList.stream().flatMap(n->n.stream().map(m->m.name)).collect(Collectors.toList());
        System.out.println(studentName);

        List<Character> studentGrade = studentList.stream().flatMap(n->n.stream().map(m->m.grade)).collect(Collectors.toList());
        System.out.println(studentGrade);
    }
}