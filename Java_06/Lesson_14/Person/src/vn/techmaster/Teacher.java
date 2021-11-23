package vn.techmaster;

public class Teacher extends Person{

    private long salary;

    public Teacher(String name, int age, long salary) {
        super(name, age);
        this.salary = salary;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + salary;
    }
}
