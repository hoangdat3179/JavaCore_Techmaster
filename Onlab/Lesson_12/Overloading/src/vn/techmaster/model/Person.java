package vn.techmaster.model;

 public class Person {
    public String name = "John";
    public int age = 20;
    public String address = "USA";
    double height;
    private double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

//    public Person(String name, int age, String address, double height) {
//        this.name = name;
//        this.age = age;
//        this.address = address;
//        this.height = height;
//    }

    public void sleep(){
        System.out.println(name + " sleep 8 hour per day");
    }
}
