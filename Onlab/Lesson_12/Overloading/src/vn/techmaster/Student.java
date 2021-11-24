package vn.techmaster;

import vn.techmaster.model.Person;

class Student extends Person {
    public String name = "Anna";
    public int age = 18;
    public String address = "Mexico";
//    public Student(String name, int age, String address, double height) {
//        super(name, age, address, height);
//    }



    @Override
    public void sleep() {
        System.out.println(getName() + " sleep 6 hour per day");
    }
}
