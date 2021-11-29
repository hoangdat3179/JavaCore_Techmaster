package vn.techmaster;

import java.util.ArrayList;

public class PersonRepository {
    ArrayList<Person> persons;
    public ArrayList<Person> getListPerson(){
        persons = new ArrayList<>();
        persons.add(new Person("John", 34, "Doctor"));
        persons.add(new Person("John", 34, "Teacher"));
        persons.add(new Person("John", 34, "Doctor"));
        persons.add(new Person("John", 34, "Doctor"));
        persons.add(new Person("John", 34, "Teacher"));
        return persons;

    }
}
