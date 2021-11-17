package vn.techmaster.repository;

import vn.techmaster.model.Student;

import java.util.ArrayList;
import java.util.Collections;

public class StudentRepository {
    public ArrayList<Student> students;
    public ArrayList<Student> getData(){
        students = new ArrayList<>();
        students.add(new Student("Hoàng", 7, 9.5));
        students.add(new Student("Linh", 7.5, 9));
        students.add(new Student("An", 8, 7));
        students.add(new Student("Quang", 6, 10));
        return students;
    }

    public void compareStudentByGPA(){
        Collections.sort(students);
    }

    public void print(){
        for (Student s: students) {
            System.out.println(s);
        }
    }
}
