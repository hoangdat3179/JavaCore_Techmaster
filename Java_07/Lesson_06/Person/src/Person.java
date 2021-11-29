public class Person {
    public String name;
    public int age;
    public String address;

    public static String school = "Techmaster";

    public static void changeSchool(){
        school = "CNTT";
    }

    static {
        System.out.println("Gọi tới khối static");
    }

    public double getPoint(){
        return 8.5;
    }


    //Tạo constructor mặc định
    public Person(){
        System.out.println("Gọi tới constructor mặc định");
    }

    //Constructor có tham số
//    public Person(String ten, int tuoi, String diaChi){
//        name = ten;
//        age = tuoi + 3;
//        address = diaChi;
//    }


    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void study(){
        System.out.println(name + " đi học");
    }

    @Override
    public String toString() {
        return name + " - " + age + " - " + address + " - " +getPoint();
    }
}
