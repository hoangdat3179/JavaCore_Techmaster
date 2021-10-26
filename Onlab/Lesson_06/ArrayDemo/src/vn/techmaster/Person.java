package vn.techmaster;

public class Person {
    String name;
    int age;

    Person(String myName, int myAge){
//        System.out.println("Xin chào");
        name = myName;
        age = myAge;
    }

    void display(){
        System.out.println(name + " - " + age);
    }

    @Override
    public String toString() {
        return name + " - " + age;
    }
}
