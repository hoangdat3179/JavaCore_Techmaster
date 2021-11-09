package vn.techmaster;

public class FullTime {
    int id;
    String name;
    String email;
    String mobile;
    long salary;
    int dateNumber;

    public FullTime(int id, String name, String email, String mobile, long salary, int dateNumber) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.salary = salary;
        this.dateNumber = dateNumber;
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

    public int getDateNumber() {
        return dateNumber;
    }

    public void setDateNumber(int dateNumber) {
        this.dateNumber = dateNumber;
    }
    public void display(){
        System.out.print(id + " - " + name + " - " + salary+ " - " + getTotalSalary());
    }


    private long getTotalSalary() {
        return 0;
    }
}
