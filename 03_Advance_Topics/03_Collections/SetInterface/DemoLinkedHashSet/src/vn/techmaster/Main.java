package vn.techmaster;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //Khởi tạo LinkedHashSet
        Set<Integer> set = new LinkedHashSet<>();
        //Thêm phần tử vào set
        set.add(5);
        set.add(1);
        set.add(7);
        set.add(9);

        System.out.println(set);

        set.add(7);  //Thêm phần tử trùng lặp
        System.out.println(set);

        set.remove(7); //Loại bỏ phần tử
        System.out.println(set);
    }
}
