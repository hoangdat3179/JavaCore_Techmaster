package vn.techmaster;

public class Main {

    public static void main(String[] args) {
        Square sq = new Square(5);
        System.out.println("Diện tích hình vuông: " +sq.area());
        System.out.println("Chu vi hình vuông: " +sq.perimeter());

        Rectangle re = new Rectangle(4,6);
        System.out.println("Diện tích hình chữ nhât: " +re.area());
        System.out.println("Chu vi hình hình chữ nhật: " +re.perimeter());
    }
}
