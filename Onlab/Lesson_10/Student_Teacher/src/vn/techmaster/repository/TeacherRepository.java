package vn.techmaster.repository;

import vn.techmaster.model.Teacher;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TeacherRepository {
    public ArrayList<Teacher> teachers;

    public ArrayList<Teacher> getData(){
        teachers = new ArrayList<>();
        teachers.add(new Teacher("Huy", 3000000));
        teachers.add(new Teacher("Cường", 7000000));
        teachers.add(new Teacher("Ngọc", 5000000));
        return teachers;
    }

    public void printList(){
        for(Teacher t : teachers){
            System.out.println(t);
        }
    }

    public void compareTeacherByName(){
        //Sắp xếp theo tên
        Collections.sort(teachers, new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                //compareTo() Phương thức so sánh của class String
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println("Danh sách giảng viên sắp xếp theo tên: ");
        printList();
    }

    public void compareTeacherBySalary(){
        //Sắp xếp theo mức lương
        Collections.sort(teachers, new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                return (int) (o1.getSalary() - o2.getSalary());
            }
        });
        System.out.println("Danh sách sắp xếp theo lương: ");
        printList();
    }
}
