package vn.techmaster;

public class Developer extends Employee{
    double overtime;


    public Developer(int id, String name, String email, String mobile, long salary, double overtime) {
        super(id, name, email, mobile, salary); //Gọi trực tiếp tới contructor của lớp cha gần nhất
        this.overtime = overtime;
    }

    public double getOvertime() {
        return overtime;
    }

    public void setOvertime(double overtime) {
        this.overtime = overtime;
    }

    @Override
    public void display() {
        super.display();  //gọi trực tiếp phương thức của lớp cha gần nhất
        System.out.print(" " +overtime + " " + getTotalSalary(200000) +"\n");
    }

    @Override
    public double getTotalSalary(int salary) {
        return getSalary() + salary*overtime;
    }
}
