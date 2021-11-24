import java.util.Scanner;
public class Person {
    public String name;
    public int age;
    public String address;

    public void input(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập tên: ");
        name = sc.nextLine();
        System.out.println("Nhập tuổi: ");
        age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập địa chỉ: ");
        address = sc.nextLine();
    }

    public void output(){
        System.out.printf("Tên tôi là %s, năm nay tôi %d tuổi, tôi đến từ %s ",name, age, address);
    }
}
