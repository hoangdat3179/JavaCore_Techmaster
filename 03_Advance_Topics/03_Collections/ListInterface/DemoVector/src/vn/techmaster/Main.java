package vn.techmaster;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        List<Student> students = new Vector<>();
        students.add(new Student("Hoàng", 18, 8.5));
        students.add(new Student("Linh", 19, 7));
        students.add(new Student("Cường", 16, 9));
        students.add(new Student("Tuấn", 18, 5));

        for (Student s: students) {
            System.out.println(s);
        }
    }
}
