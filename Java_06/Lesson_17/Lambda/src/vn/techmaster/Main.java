package vn.techmaster;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Person person = new Person("Ngọc") {
//            @Override
//            public void eat() {
//                System.out.println("Bún đậu mắm tôm");
//            }
//        };
//
//        person.eat();

//        IPerson ip = new IPerson() {
//            @Override
//            public void sleep(String name) {
//
//            }
//
//            @Override
//            public int getAge(int age) {
//                return 0;
//            }
//
//
//        };

        //ip.sleep();

//        IPerson iPerson = (age) -> {
//            if(age > 0 && age < 200){
//                return age;
//            }else{
//                return 0;
//            }
//        };
//
//        System.out.println(iPerson.getAge(500));

//        IPerson iPerson = (h, w) -> {
//            return w/(h*h);
//        };
//
//        System.out.println(iPerson.bmi(1.5, 40));
//
        List<String> list = new ArrayList<>();
        list.add("Lượm");
        list.add("Kem");
        list.add("Đỗ");
//
        //Sử dụng foreach
        for (String pet: list) {
            System.out.println(pet);
        }

        //Sử dụng lambda
        list.forEach(pet -> System.out.println(pet));

        //Sử dụng method reference
        list.forEach(System.out::println);
//
        //Sắp xếp sử dụng lớp vô danh
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
//
        //Sử dụng lambda
        list.sort((o1, o2) -> o1.compareTo(o2));
        System.out.println(list);

        //Sử dụng method reference
        list.sort(String::compareTo);
        System.out.println(list);

        IPerson s = Student::new;
        s.sleep("Ngọc");


        String[] names = {"Ngọc", "Hiên", "Huy", "Ba", "Cường"};


        //Sử dụng lớp vô danh
        Arrays.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        for (String str: names ) {
            System.out.print(str+ "\t");
        }
        System.out.println();


        //Sử dụng lambda
        Arrays.sort(names, (o1, o2) -> o1.compareTo(o2));
        for (String str: names ) {
            System.out.print(str+ "\t");
        }
        System.out.println();

        //Sử dụng method reference
        Arrays.sort(names, String::compareTo);
        for (String str: names ) {
            System.out.print(str+"\t");
        }
    }
}
