package vn.techmaster;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileReader;
import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) throws IOException {
//	    int a =9;
//        int b = 0;
//        int c = a/b;
//        System.out.println(c);
        //FileReader reader = new FileReader("student.json");

//        int [] arr = new int[5];
//        arr[10] = 9;

//        String str = null;
//        System.out.println("Kích thước chuỗi: " + str.length());

//        Scanner sc = new Scanner(System.in);
//        boolean isCheck = false;
//        while(!isCheck){
//            try{
//                //Đoạn code có thể ném ra ngoại lệ
//                System.out.println("Nhập số bất kỳ: ");
//                int number = Integer.parseInt(sc.nextLine());
//                //Nếu bị ngoại lệ nhảy vào khối catch chứ không thực hiện 2 câu lệnh dưới
//                System.out.println(number);
//                isCheck = true;
//
//                String str = null;
//                System.out.println("Kích thước chuỗi: " + str.length());
//
//            }catch(NumberFormatException e) {
//                //Xử lỷ ngoại lệ
//                System.out.println("Bạn cần phải nhập số, vui lòng nhập lại");
//            }catch(NullPointerException e){
//                System.out.println("Chuỗi rỗng");
//            }finally {
//                System.out.println("Khối này luôn được thực thi");
//            }

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập tuổi của bạn: ");
//        int age = sc.nextInt();
//        ThrowDemo.validateAge(age);

        //ThrowsDemo.getData();
//        try {
//            ThrowsDemo.getData();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        try{
//            ThrowsDemo.getData();
//        }catch(FileNotFoundException e){
//            System.out.println("Không tìm thấy file");
//        }
        Scanner sc = new Scanner(System.in);
        boolean isCheck = false;
        while(!isCheck){
            try {
                System.out.println("Nhập cân nặng: ");
                double weight = Double.parseDouble(sc.nextLine());
                System.out.println("Nhập chiều cao: ");
                double height = Double.parseDouble(sc.nextLine());
                BMICalcuator.bmi(height, weight);
                isCheck = true;
            } catch (MyException e) {
                System.out.println(e.getMessage());
                System.out.println("Vui lòng nhập lại");
            } catch (NumberFormatException e){
                System.out.println("Cân năng hoặc chiêu cao phải là số");
                System.out.println("Vui lòng nhập lại");
            }
        }



    }
}
