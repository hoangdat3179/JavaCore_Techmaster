package vn.techmaster;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập x: ");
        int x = sc.nextInt();

        System.out.print("Nhập y: ");
        int y = sc.nextInt();

        System.out.println("x+y = " +Calculator.addition(x,y));
        System.out.println("x-y = " +Calculator.subtraction(x,y));
        System.out.println("x*y = " +Calculator.multiplication(x,y));
        System.out.println("x/y = " +Calculator.division(x,y));
    }
}
