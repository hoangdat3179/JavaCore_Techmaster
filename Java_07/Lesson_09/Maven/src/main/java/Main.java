import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person p = new Person(1, "Ngọc", LocalDate.now(), "ngoc@gmail.com", "0123456789");
        System.out.println(p.getName());
    }
}
