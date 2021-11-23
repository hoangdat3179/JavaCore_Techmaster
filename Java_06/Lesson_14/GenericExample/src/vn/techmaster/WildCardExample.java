package vn.techmaster;

import java.util.ArrayList;

public class WildCardExample {
    public static void main(String[] args) {
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

        ArrayList<DemoKeyValue<Integer, String>> listPerson = new ArrayList<>();
        //var listPerson = new ArrayList<>();
        listPerson.add(new DemoKeyValue<>(1, "Kem"));
        listPerson.add(new DemoKeyValue<>(2, "Lượm"));
        listPerson.add(new DemoKeyValue<>(3, "Đỗ"));
        printList(listPerson);
    }

    public static void printList(ArrayList<?> list){
        for (Object obj: list) {
            System.out.println(obj);
        }
    }
}
