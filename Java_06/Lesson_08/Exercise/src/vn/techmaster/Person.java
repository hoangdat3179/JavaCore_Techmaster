package vn.techmaster;
import java.util.Scanner;

public class Person {
    int id;
    String name;
    double theoryPoint;
    double practicalPoint;
    Scanner sc = new Scanner(System.in);

    public Person() {
    }

    public Person(int id, String name, double theoryPoint, double practicalPoint) {
        this.id = id;
        this.name = name;
        this.theoryPoint = theoryPoint;
        this.practicalPoint = practicalPoint;
    }

    public Person[] setStudent(){

        System.out.println("Nhập số học sinh: ");
        int n = Integer.valueOf(sc.nextLine());
        Person[] listPerson = new Person[n];
        for(int i = 0; i < n; i++){
            System.out.println("Nhập thông tin học viên thứ " + (i+1));
            listPerson[i] = input();
        }

        return listPerson;
    }

    public Person input(){
        System.out.println("Nhập id: ");
        int id = Integer.valueOf(sc.nextLine());
        System.out.println("Nhập tên: ");
        String name = sc.nextLine();
        System.out.println("Nhập điểm lý thuyết: ");
        double theoryPoint = Double.valueOf(sc.nextLine());
        System.out.println("Nhập điểm thực hành: ");
        double practicalPoint = Double.valueOf(sc.nextLine());
        Person person = new Person(id, name, theoryPoint, practicalPoint);
        return person;
    }

    public double getGPA(double theoryPoint, double practicalPoint){
        return (theoryPoint+practicalPoint)/2;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + theoryPoint + " - " + practicalPoint + " - " + getGPA(theoryPoint, practicalPoint);
    }
}
