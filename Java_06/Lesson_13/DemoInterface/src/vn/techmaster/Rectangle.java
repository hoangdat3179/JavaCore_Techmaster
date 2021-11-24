package vn.techmaster;

public class Rectangle implements IShape, IShape.IRectangle {
    @Override
    public void draw() {
        System.out.println("Vẽ hình chữ nhật màu " + color);

    }

    @Override
    public void print() {

    }
}
