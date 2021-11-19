package vn.techmaster;

public class Main {

    public static void main(String[] args) {
        //IShape shape = new IShape();
        IShape rectangle = new Rectangle();
        rectangle.draw();

        Circle circle = new Circle();
        circle.draw();
        System.out.println("Đường kính hình tròn: " +circle.tinhDuongKinh(5));
    }
}
