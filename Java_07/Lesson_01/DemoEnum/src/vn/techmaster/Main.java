package vn.techmaster;

public class Main {

    public static final double PI = 3.14;  //Đây là hằng số, không thể thay đổi giá trị của hằng số
    public static final int MAX = 500;

    public static void main(String[] args) {
	    // write your code here
        Season s = Season.WINTER;
        System.out.println(s);

        Position p = Position.DF;
        System.out.println(p.getValue());
    }
}
