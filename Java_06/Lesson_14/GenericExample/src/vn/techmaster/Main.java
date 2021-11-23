package vn.techmaster;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String name = "Ngọc";
        ClassGeneric<String> strGeneric = new ClassGeneric<>(name);
        System.out.println("Name: " + strGeneric.getT());

        int age = 20;
        ClassGeneric<Integer> intGeneric = new ClassGeneric<>(age);
        System.out.println("Age: " + intGeneric.getT());

        DemoKeyValue<Integer, String> person1 = new DemoKeyValue<>(123, "Ngọc");
        System.out.println(person1);

        DemoKeyValue<String, String> person2 = new DemoKeyValue<>("MS0123", "Hùng");
        System.out.println(person2);

        ArrayList<String> strList = new ArrayList<>();
        strList.add("Java");
        strList.add("HTML/CSS");
        strList.add("JS");
        strList.add("Ruby");

        printList(strList);

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(2);
        intList.add(9);
        intList.add(3);
        intList.add(7);

        printList(intList);


    }
    public static <E> void printList(ArrayList<E> list){
        for (E str: list) {
            System.out.println(str);
        }
    }
}
