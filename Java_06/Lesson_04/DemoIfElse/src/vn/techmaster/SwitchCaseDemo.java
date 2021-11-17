package vn.techmaster;
import java.util.Scanner;

public class SwitchCaseDemo {

    public static void dayOfWeek(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số bất kỳ: ");
        int number = sc.nextInt();

        switch(number){
            case 2:
            case 3:
                System.out.println("Monday");
                //break;

                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            case 8:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Không có ngày này trong tuần");

        }
    }
}
