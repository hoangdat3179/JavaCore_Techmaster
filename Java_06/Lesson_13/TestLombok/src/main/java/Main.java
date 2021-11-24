public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Ngọc");

        Person p1 = new Person("Ngọc", 25, "Hà Giang");

        System.out.println(p.getName());
    }
}
