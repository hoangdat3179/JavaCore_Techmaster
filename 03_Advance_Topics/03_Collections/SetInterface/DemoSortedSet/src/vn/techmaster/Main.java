package vn.techmaster;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //Khởi tạo Set có kiểu là Integer
        Set<Integer> set = new HashSet<>();
        //Thêm phần tử vào set
        set.add(5);
        set.add(1);
        set.add(7);
        set.add(3);

        System.out.println(set);

        //Thêm phần tử trùng lặp
        set.add(3);
        System.out.println(set);

        //Xóa phần tử 7
        set.remove(7);
        System.out.println("Set sau khi loại bỏ phần tử: " + set);
    }
}
