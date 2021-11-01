package vn.techmaster;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person hoang = new Person("Hoàng", 20, "Hà Nội");
        Person lan = new Person("Lan", 18, "Thái Nguyên");
        Person tuan = new Person("Tuấn", 21, "Vĩnh Phúc");
        Person nam = new Person("Nam", 27, "TP Hồ Chí Minh");

        ArrayList<Person> listPerson = new ArrayList<>();
        listPerson.add(hoang);
        listPerson.add(lan);
        listPerson.add(tuan);
        listPerson.add(nam);

        printList(listPerson);

    }

    public static void printList(ArrayList<Person> list){
        for (Person person: list) {
            System.out.println(person);
        }
    }
}
