package vn.techmaster;

import vn.techmaster.service.IStudent;

public class Student extends Person implements IStudent {
    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {

    }

    @Override
    public String toString() {
        return getName() + " - " + getAge();
    }
}
