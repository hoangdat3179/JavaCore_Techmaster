package vn.techmaster;

import vn.techmaster.service.ITeacher;

public class Teacher extends Person implements ITeacher {
    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach(String subject) {

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
