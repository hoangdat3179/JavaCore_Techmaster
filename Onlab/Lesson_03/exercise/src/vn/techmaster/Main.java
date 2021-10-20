package vn.techmaster;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập x: ");
        int x = sc.nextInt();

        System.out.print("Nhập y: ");
        int y = sc.nextInt();

        menu();
        int choice = sc.nextInt();

        switch (choice){
            case 1:
                System.out.println("x+y = " +Calculator.addition(x,y));
                break;
            case 2:
                System.out.println("x-y = " +Calculator.subtraction(x,y));
                break;
            case 3:
                System.out.println("x*y = " +Calculator.multiplication(x,y));
                break;
            case 4:
                System.out.println("x/y = " +Calculator.division(x,y));
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Không có lựa chọn này!!!");

        }






    }

    public static void menu(){
        System.out.println("Mời bạn lựa chọn: ");
        System.out.println("1 - x+y");
        System.out.println("2 - x-y");
        System.out.println("3 - x*y");
        System.out.println("4 - x/y");
        System.out.println("0 - Thoát chương trình");
        System.out.println("Lựa chọn của bạn là: ");
    }
}
