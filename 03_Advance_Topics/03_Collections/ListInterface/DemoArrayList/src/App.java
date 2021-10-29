import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> listAnimal = new ArrayList<String>(); //Tạo ArrayList




        List<Person> listPerson = new ArrayList<>();
        listPerson.add(new Person("Hoàng", 20, "Hà Nội"));
        listPerson.add(new Person("Lan", 18, "Thái Nguyên"));
        listPerson.add(new Person("Tuấn", 21, "Vĩnh Phúc"));
        listPerson.add(new Person("Nam", 27, "TP Hồ Chí Minh"));

        for (Person person : listPerson) {
            System.out.println(person);
        }

    }
}
