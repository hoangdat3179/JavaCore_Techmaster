package vn.techmaster;

import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        //Khởi tạo TreeSet
        TreeSet<Integer> set = new TreeSet<>();
        //Thêm phần tử vào set
        set.add(5);
        set.add(1);
        set.add(7);
        set.add(3);

        System.out.println(set);

        set.add(3);//Thêm phần tử trùng lặp
        System.out.println(set);

        //Xóa phần tử
        set.remove(7);
        System.out.println(set);
        System.out.println("Sắp xếp theo thứ tự giảm dần: " + set.descendingSet());
    }
}
