package vn.techmaster;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//	    Person p = new Person("Ngọc", 25, "HN");
//        System.out.println(p.getName() + " - " + p.getAge() + " - " + p.getAddress());
//
//        p.setName("Linh");
//        p.setAge(-26);
//        System.out.println(p.getName() + " - " + p.getAge() + " - " + p.getAddress());
//        ArrayList<String> list = new ArrayList<>();
//        list.add("HTML/CSS");
//        list.add("JS");
//        list.add("Database");
//        list.add("Spring boot");
//
//
//        System.out.println(list);
//
//        printList(list);
//
//        list.add(1, "Java");
//        System.out.println("Danh sách sau khi chèn: ");
//        printList(list);
//
//        list.set(1, "Java core");
//        System.out.println("Danh sách sau khi sửa: ");
//        printList(list);
//
//        list.remove("Database");
//        System.out.println("Danh sách sau khi xóa: ");
//        printList(list);
//
//        list.remove(1);
//        System.out.println("Danh sách sau khi xóa: ");
//        printList(list);
//        System.out.println("kích thước: " + list.size());
//        list.clear();
//        System.out.println("Kích thước sau khi xóa toàn bộ: " + list.size());

        ArrayList<Person> listPerson = new ArrayList<>();
        Person p = new Person("Ngọc", 25, "HN");
        listPerson.add(p);
        listPerson.add(new Person("Linh", 20, "HN")) ;
        listPerson.add(new Person("Hoàng", 23, "HN")) ;
        listPerson.add(new Person("Tuấn", 20, "HN")) ;

        for(Person person : listPerson){
            System.out.println(person);
        }

        System.out.println("Danh sách những người 20 tuổi: ");
        for(int i = 0; i < listPerson.size(); i++){
            if(listPerson.get(i).getAge() == 20){
                System.out.println(listPerson.get(i));
            }
        }

    }

    public static void printList(ArrayList<String> list){
        for(String str : list){
            System.out.println(str);
        }
    }
}
