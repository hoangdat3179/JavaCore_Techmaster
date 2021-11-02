package vn.techmaster;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(1);
//        numbers.add(3);
//        numbers.add(7);
//        numbers.add(2);
//        numbers.add(4);
//        numbers.add(3);
//
//        System.out.println("Danh sách ban đầu: ");
//        printList(numbers);
//
//        Collections.sort(numbers);
//        System.out.println("\nDanh sách sau khi sắp xếp: ");
//        printList(numbers);
////
////        numbers.add(2, 0);
////        System.out.println("\nDanh sách sau khi chèn: ");
////        printList(numbers);
////
////        ArrayList<Integer> listClone = new ArrayList<>();
////        listClone.add(0);
////        listClone.add(0);
////        listClone.add(0);
////        listClone.add(0);
////        listClone.add(0);
////        System.out.println("\nList clone ban đầu: ");
////        printList(listClone);
//////        listClone.addAll(numbers);
//////        System.out.println("\nList clone: ");
//////        printList(listClone);
////
////        listClone.addAll(2, numbers);
////        System.out.println("\n List clone sau khi chèn: ");
////        printList(listClone);
////
////        System.out.println("\nKích thước của listClone: " + listClone.size());
////
////        System.out.println("listClone.get(5): " + listClone.get(5));
////        listClone.set(5, 9);
////        System.out.println("Danh sách sau khi sửa: ");
////        printList(listClone);
////
////        listClone.remove(4);
////        System.out.println("\nDanh sách sau khi xóa: ");
////        printList(listClone);
//////        listClone.removeAll(listClone);
//////        System.out.println("\nDanh sách sau khi xóa toàn bộ: ");
//////        printList(listClone);
////        //numbers.removeAll(listClone);
////        listClone.removeAll(numbers);
////        System.out.println("\nlistClone: ");
////        printList(listClone);
////        System.out.println("\nnumbers: ");
////        printList(numbers);
//
//        ArrayList<String> names = new ArrayList<>();
//
//        names.add("Ngọc");
//        names.add("Hùng");
//        names.add("Quang");
//        names.add("Ánh");
//        names.add("Tuấn");
//        System.out.println("Danh sách ban đầu: ");
//        printNames(names);
//
//        names.remove("Hùng");
//        System.out.println("\nDanh sách sau khi xóa: ");
//        printNames(names);
//        //Arrays.sort(names.toArray());
//        Collections.sort(names);
//        System.out.println("\nDanh sách sau khi sắp xếp: ");
//        printNames(names);

        ArrayList<Teacher> listTeacher = new ArrayList<>();
        Teacher teacher = new Teacher("Ngọc", 26, "HN");
        listTeacher.add(teacher);
        listTeacher.add(new Teacher("Hiên", 25, "HN"));

        for (Teacher t: listTeacher) {
            System.out.println(t);
        }

    }

    public static void printList(ArrayList<Integer> list){
        for (Integer i: list) {
            System.out.print(i + "\t");
        }
    }

    public static void printNames(ArrayList<String> list){
        for (String name: list) {
            System.out.println(name);
        }
    }
}
