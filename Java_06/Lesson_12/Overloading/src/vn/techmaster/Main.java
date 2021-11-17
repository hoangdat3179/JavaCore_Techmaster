package vn.techmaster;



import vn.techmaster.model.Person;

public class Main {

    public static void main(String[] args) {
//        Calculator cal = new Calculator();
//        cal.sum(4, 5);
//        cal.sum(4, 5, 6);
//        cal.sum(4.5, 5.8);
        //Upcasting
        Person person1 = new Student();
        person1.sleep();
        System.out.println(person1.name);


        //downcasting
        Person person2 = new Student();
        Student student = (Student) person2;
        System.out.println(student.name);
    }
}
