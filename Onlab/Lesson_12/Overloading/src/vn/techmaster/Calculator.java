package vn.techmaster;

public class Calculator {
    public void sum(int a, int b){
        System.out.println(a + b);
    }

    //Thực hiện nạp chồng bằng cách thay đổi tham số
    public void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }

    //Thực hiện nạp chồng bằng cách thay đổi kiểu dữ liệu của tham số
    public void sum(double a, double b){
        System.out.println(a+b);
    }

    //Không thể thực hiện nạp chồng bằng cách thay dổi kiểu trả về của phương thức
//    public int sum(int a, int b){
//        return a+b;
//    }
}
