package vn.techmaster;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

    public List createList(){
        List<String> names = new LinkedList<>(); //Khởi tạo LinkedList
        names.add("John");  //Thêm phần tử vào LinkedList
        names.add("Anna");
        names.add("Peter");
        names.add("Victor");

        names.add(2, "Emma"); //Thêm phần tử vào vị trí index được chỉ định

        return names;
    }

    public void editList(int index, String name, List<String> list){
        System.out.println("Phần tử sẽ bị thay thế là: " +list.set(index, name));
    }

    public void print(List<String> list){
        //Sử dụng foreach
        System.out.println("Sử dụng foreach: ");
        for (String name: list) {
            System.out.println(name);
        }
    }


}
