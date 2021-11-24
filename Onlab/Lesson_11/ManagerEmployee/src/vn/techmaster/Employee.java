package vn.techmaster;

public abstract class Employee {
    int id;
    String name;
    String email;
    String mobile;
    long salary;

    public Employee(int id, String name, String email, String mobile, long salary) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public abstract long getTotalSalary();

    public void display(){
        System.out.print(id + " - " + name + " - " + salary+ " - " + getTotalSalary());
    }
}
