package vn.techmaster;

public class Square extends Shape{
    int a;

    public Square(int a) {
        this.a = a;
    }

    @Override
    public double area() {
        return a * a;
    }

    @Override
    public double perimeter() {
        return a * 4;
    }
}
