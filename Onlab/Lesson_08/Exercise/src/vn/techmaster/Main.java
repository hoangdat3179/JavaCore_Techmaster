package vn.techmaster;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Person p = new Person();
        Person [] persons =  p.setStudent();
        for (Person person: persons) {
            System.out.println(person);
        }

    }
}
