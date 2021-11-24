package vn.techmaster;

public class Employee {
    private String name;
    private String email;
    private String mobile;
    private long salary;

    public Employee(String name, String email, String mobile, long salary) {
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.salary = salary;
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

    @Override
    public String toString() {
        return name + " - " + email + " - " + mobile + " - " + salary;
    }
}
