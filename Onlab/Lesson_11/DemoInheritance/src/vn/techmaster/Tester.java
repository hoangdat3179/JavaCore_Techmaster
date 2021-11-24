package vn.techmaster;

public class Tester extends Employee {
    int bugs;

    public Tester(int id, String name, String email, String mobile, long salary, int bugs) {
        super(id, name, email, mobile, salary);
        this.bugs = bugs;
    }

    public int getBugs() {
        return bugs;
    }

    public void setBugs(int bugs) {
        this.bugs = bugs;
    }

    @Override
    public void display() {
        super.display();
        System.out.print( " " + bugs + " " + getTotalSalary(100000) + "\n");
    }

    @Override
    public double getTotalSalary(int salary) {
        return getSalary() + salary*bugs;
    }
}
