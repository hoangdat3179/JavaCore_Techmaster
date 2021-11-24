package vn.techmaster;

public class PartTime extends Employee {
    int hour;

    public PartTime(int id, String name, String email, String mobile, long salary, int hour) {
        super(id, name, email, mobile, salary);
        this.hour = hour;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public long getTotalSalary() {
        return 0;
    }

    @Override
    public void display() {
        super.display();
        System.out.print(" - " + hour);
    }
}
