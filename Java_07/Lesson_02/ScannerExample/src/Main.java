import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
////        System.out.println("Nhập số nguyên bất kỳ: ");
////        int number = Integer.parseInt(sc.nextLine());
////
////        System.out.println("Số vừa nhập: " + number);
////
////        System.out.println("Nhập số thực: " );
////        //double number2 = sc.nextDouble();
////        double number2 = Double.parseDouble(sc.nextLine());
////        System.out.println("Số vừa nhập: " + number2);
//        //sc.nextLine();
//        System.out.println("Vui lòng nhập tên bạn: ");
//        String name = sc.next();
//        System.out.println("Tên cảu bạn là: " + name);
//
//        sc.close();

//        System.out.print("Nhập tên: ");
//        String name = sc.nextLine();
//        System.out.printf("Xin chào các bạn, tôi tên là %s %s %s\n", name, name, name);
//        System.out.print("Tôi tên là " +name);
//
//        System.out.printf("Tôi tên là %s",name);

        //String name = "Ngọc";
//        int age = 25;
//        String address = "Hà Giang";
//        System.out.printf("Tôi tên là %s, năm nay tôi %d tuổi, tôi đến từ %s\n", name, age, address);
//        System.out.println("Tôi tên là " + name+ ", năm nay tôi " +age+" tuổi, tôi đến từ " + address);

        double weight = 40.7;
        double height = 1.5;
        double bmi = weight/(Math.pow(height, 2));
        System.out.printf("Chỉ số bmi của bạn là: %.2f\n",bmi);
        System.out.println("Chỉ số bmi khi được làm tròn: " +Math.ceil(bmi));

        Random ran = new Random();
        int randomNumber = ran.nextInt(20);
        System.out.println("Số ngẫu nhiên: " +randomNumber);

        int number = ran.nextInt(20)+10;
        System.out.println(number );
    }
}
