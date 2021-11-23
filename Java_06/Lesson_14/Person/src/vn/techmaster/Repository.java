package vn.techmaster;

import java.util.ArrayList;

public class Repository {
    ArrayList<Student> list;
    ArrayList<Teacher> listTeacher;

    public ArrayList<Student> getAllStudent(){
        list = new ArrayList<>();
        list.add(new Student("Hoàng", 18, 8.8));
        list.add(new Student("Hoàng", 18, 8.8));
        list.add(new Student("Hoàng", 18, 8.8));
        list.add(new Student("Hoàng", 18, 8.8));
        return list;

    }

    public ArrayList<Teacher> getAllTeacher(){
        listTeacher = new ArrayList<>();
        listTeacher.add(new Teacher("Hoàng", 18, 60000000));
        listTeacher.add(new Teacher("Hoàng", 18, 5000000));

        return listTeacher;

    }
}
