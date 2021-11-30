import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Person cuong = new Person();
//        cuong.name = "Cường";
//        cuong.age = 20;
//        cuong.address = "HN";
//        System.out.println(cuong);
//        cuong.study();
//
//        Person thai = new Person();
//        thai.name = "Thái";
//        thai.age = 21;
//        thai.address = "HN";
//        System.out.println(thai);
//        thai.study();
//
//        Person trang = new Person("Trang", 22, "HN");
//        System.out.println(trang);

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số học sinh: ");
        int n = sc.nextInt();
        sc.nextLine();

        Person persons[] = new Person[n];
        for(int i = 0; i < n; i++){
            System.out.print("Nhập tên: ");
            String name = sc.nextLine();
            System.out.print("Nhập tuổi: ");
            int age = Integer.parseInt(sc.nextLine());
            System.out.print("Nhập địa chỉ: ");
            String address = sc.nextLine();

            Person p = new Person(name, age, address); //Tạo đối tượng mới
            persons[i] = p; //gán đối tượng mới cho mảng ở vị trí i
        }

        System.out.println("Danh sách: ");
        for(int i = 0; i <n; i++){
            System.out.println(persons[i]);
        }

        //Tìm kiếm theo tên
        System.out.println("Nhập tên bạn muốn tìm kiếm: ");
        String findName = sc.nextLine();
        for(int i = 0; i < n; i++){
            if(persons[i].name.contains(findName)){
                System.out.println(persons[i]);
            }
        }


    }
}
