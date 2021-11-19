package vn.techmaster;

public class Retangle {
    //Phương thức tính diện tích hình chữ nhật
    public int area(int a, int b){
        int s = a*b;
        return s;  //Do phương thức area() có kiểu trả về là int nên cần return lại giá trị có cùng kiểu với kiểu trả về
    }

    //Phương thức tính chu vi
    public int perimeter(int a, int b){
        int c = (a+b)*2;
        return c;
    }
}
