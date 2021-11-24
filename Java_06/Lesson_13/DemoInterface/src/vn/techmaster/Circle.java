package vn.techmaster;

public class Circle  implements ICircle{
    @Override
    public void draw() {
        System.out.println("Vẽ hình tròn");
    }

    @Override
    public int tinhDuongKinh(int r) {
        return 2*r;
    }
}
