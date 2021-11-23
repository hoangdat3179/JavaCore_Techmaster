package vn.techmaster;

public class Student extends Person{
    private double point;

    public Student(String name, int age, double point) {
        super(name, age);
        this.point = point;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + point;
    }
}
