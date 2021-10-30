package vn.techmaster;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Câu 1
        //Vẽ tam giác sao
        Draw.drawTriagle(4);
        System.out.println("-----------------------");
        Draw.drawRightTriagle(4);
        System.out.println("-----------------------");
        //Vẽ hình vuông
        Draw.drawSquare(4);
        System.out.println("\n-----------------------\n");

        //Câu 2
        //Chuẩn hóa chuỗi
        String str = "Lục  thanh  ngọc  ";
        System.out.println("Chuỗi sau khi chuẩn hóa: " + StringNormalization.standardize(str));
        //Chuỗi palindrome
        String input = "abbba";
        StringNormalization.isPalindrome(input);
        System.out.println("\n-----------------------\n");


        //Câu 3
        //Liệt kê 10 số nguyên tố đầu tiên
        System.out.println("10 số nguyên tố đầu tiên là: ");
        PrimeNumber.printFirstPrimeNumber();
        //Liệt kê các số nguyên tố nhỏ hơn 10
        System.out.println("\nCác sô nguyên tố nhỏ hơn 10 là: ");
        PrimeNumber.printPrimeNumber();
        System.out.println("\n-----------------------\n");

        //Câu 4
        //Đếm số từ trong chuỗi
        String s = "You only live once, but if you do it right, once is enough";
        System.out.println("Số từ trong chuỗi là: " + StringDemo.countWords(s));
        //Đếm và in ra index của các ký tự o
        StringDemo.countChars(s);
        System.out.println("\n-----------------------\n");

        //Câu 5
        //Viết chương trình sinh ra số ngẫu nhiên, kiểm tra số đó có là số nguyên tố không.
        PrimeNumber.randomNumber();

        System.out.println("\n-----------------------\n");
        //Câu 6
        //Viết chương trình nhập email của bạn, kiểm tra email đó có hợp lệ không
        ValidateEmail.checkEmail();

        System.out.println("\n-----------------------\n");

        //Câu 7
        //Nhập thông tin mảng
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số dòng: ");
        int row = sc.nextInt();
        System.out.println("Nhập số cột: ");
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        arr = MultiArray.createArray(arr, row, col);
        //In mảng
        MultiArray.printArray(arr);
        //Tìm đường chéo chính của ma trận
        MultiArray.findDiagonal(arr, row, col);
    }
}
