package vn.techmaster.model;

public class Student implements Comparable<Student> {
    private String name;
    private double theoryPoint;
    private double praticalPoint;

    public Student(String name, double theoryPoint, double praticalPoint) {
        this.name = name;
        this.theoryPoint = theoryPoint;
        this.praticalPoint = praticalPoint;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTheoryPoint() {
        return theoryPoint;
    }

    public void setTheoryPoint(double theoryPoint) {
        this.theoryPoint = theoryPoint;
    }

    public double getPraticalPoint() {
        return praticalPoint;
    }

    public void setPraticalPoint(double praticalPoint) {
        this.praticalPoint = praticalPoint;
    }

    private double gpa(){
        return (this.theoryPoint + this.praticalPoint)/2;
    }

    @Override
    public String toString() {
        return name + " - "+ gpa();
    }

    //Phương thức không có phần thân của interface Comparable
    @Override
    public int compareTo(Student o) {
        //Sử dụng toán tử 3 ngôi
        int result = this.gpa() > o.gpa() ? -1 : 1;
        return result;
    }
}
