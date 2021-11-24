package vn.techmaster;

public class Triagle extends Shape implements InterfaceA{
    int a;
    int b;
    int c;
    int h;

    public Triagle(int a, int b, int c, int h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    @Override
    public double area() {
        return (a*h)/2;
    }

    @Override
    public double perimeter() {
        return a+b+c;
    }

    @Override
    public void getHeight() {

    }
}
