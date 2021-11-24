package vn.techmaster;
import java.util.Scanner;
public class Dog {
    String breed;
    String size;
    String color;
    int age;

    //Constructor mặc định
    public Dog(){
        System.out.println("Gâu gâu gâu");
    }

    //Constructor có tham số
    public Dog(String loai, String kichThuoc, String mauLong, int tuoi){
        this.breed = loai;
        this.size = kichThuoc;
        this.color = mauLong;
        this.age = tuoi;
    }

//    public Dog(String breed, String size, String color) {
//        this.breed = breed;
//        this.size = size;
//        this.color = color;
//    }

    @Override
    public String toString() {
        return breed + " - " + size + " - " + color + " - " +age;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập loại: ");
        breed = sc.nextLine();
        System.out.println("Nhập kích thước: ");
        size = sc.nextLine();
        System.out.println("Nhập màu lông: ");
        color = sc.nextLine();
        System.out.println("Nhập tuổi: ");
        age = sc.nextInt();
    }
    
}
