package vn.techmaster;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	    Person p1 = new Person("AAA", 26, "HN");
        Person p2 = new Person("GGG", 21, "QN");
        Person p3 = new Person("EEE", 22, "BN");

        ArrayList<Person> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);

        System.out.println("Danh sách ban đầu: ");
        print(list);

        Collections.sort(list);
        System.out.println("Danh sách sau khi sắp xếp theo tuổi: ");
        print(list);

        //Sắp xếp theo tên sử dụng comparator
        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o2.getName().compareTo(o1.getName());
            }
        });
        System.out.println("Danh sách sau khi sắp xếp theo tên: ");
        print(list);

        //Sắp xếp theo địa chỉ
        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAddress().compareTo(o2.getAddress());
            }
        });
        System.out.println("Danh sách sắp xếp theo địa chỉ:");
        print(list);


    }

    public static void print(ArrayList<Person> list){
        for (Person p: list) {
            System.out.println(p);
        }
    }
}
