package vn.techmaster;

import java.util.Scanner;

public class TernaryOperator {
    static void demo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số bất kỳ: ");
        int n = sc.nextInt();

        String result = n % 2 == 0 ? n + " là số chẵn" : n + " là số lẻ";
        System.out.println(result);
    }
}
