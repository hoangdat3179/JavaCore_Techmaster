package vn.techmaster;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<? extends Person>list ;
        Repository re = new Repository();
        Scanner sc = new Scanner(System.in);
        System.out.println("1 - in danh sách học sinh \n2 - in danh sách giảng viên \n lựa chọn");
        int choose = sc.nextInt();
        switch (choose){
            case 1:
                list = re.getAllStudent();
                printList(list);
                break;

            case 2:
                list = re.getAllTeacher();
                printList(list);
                break;
        }
    }

    public static void printList(ArrayList<? extends Person> list){
        for (Object o: list) {
            System.out.println(o);
        }
    }
}
