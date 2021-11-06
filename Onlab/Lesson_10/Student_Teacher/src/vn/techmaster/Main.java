package vn.techmaster;

import vn.techmaster.repository.StudentRepository;
import vn.techmaster.repository.TeacherRepository;

public class Main {

    public static void main(String[] args) {

        //Quản lý học sinh

        StudentRepository sRepo = new StudentRepository();
        sRepo.students = sRepo.getData();
        System.out.println("Danh sách học sinh: ");
        sRepo.print();

        System.out.println("Bảng xếp hạng học sinh: ");
        sRepo.compareStudentByGPA();
        sRepo.print();

        System.out.println("\n-----------------\n");

        //Quản lý giảng viên
        TeacherRepository tRepo = new TeacherRepository();
        tRepo.teachers = tRepo.getData();

        System.out.println("Danh sách giảng viên");
        tRepo.printList();

        tRepo.compareTeacherByName();

        tRepo.compareTeacherBySalary();
    }


}
