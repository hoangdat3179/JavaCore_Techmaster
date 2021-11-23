package vn.techmaster;

import java.util.ArrayList;

public class WirdCardDemoExtend {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(4);
        intList.add(6);
        intList.add(7);
        intList.add(3);

        ArrayList<Double> doubleList = new ArrayList<>();
        doubleList.add(6.7);
        doubleList.add(5.5);
        doubleList.add(9.3);
        doubleList.add(6.2);

        ArrayList<? extends Number> list;
        list = doubleList;
        printList(list);
    }

    public static void printList(ArrayList<?> list){
        for (Object obj: list) {
            System.out.println(obj);
        }
    }
}
