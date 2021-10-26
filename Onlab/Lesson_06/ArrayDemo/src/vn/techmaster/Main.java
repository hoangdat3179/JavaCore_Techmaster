package vn.techmaster;
import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	// write your code here
        //arrayNumber();
        //arrayString();

        //MultiArray.input();


        //person.display();

        Person[] listPerson = new Person[3];
        for(int i = 0 ; i < listPerson.length; i++){
            System.out.printf("Nhập thông tin người %d: \n" , i+1);
            System.out.print("Tên: ");
            String name = sc.nextLine();
            System.out.print("Tuổi: ");
            int age = sc.nextInt();
            sc.nextLine();
            Person person = new Person(name, age);
            listPerson[i] = person;
        }

        for (Person p : listPerson) {
            System.out.println(p);
        }
    }

    static void arrayString(){
        Scanner sc = new Scanner(System.in);
        //mảng kiểu String
        String names [] = new String[5];
        for(int i = 0; i< names.length; i++){
            System.out.printf("Nhập phần tử có index %d : " , i);
            String name = sc.nextLine();
            names[i] = name;//Gán phần tử mảng ở vị trí i = name
        }

        //Duyệt mảng
        System.out.println("Mảng sau khi nhập: ");
        for(int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }

        //Lấy phần tử có index = 3
        System.out.println("Phần có index = 3 là: " + names[3]);

        //sử dụng for each
        System.out.println("Sử dụng foreach: ");
        for(String str : names){
            System.out.println(str);
        }

        //sửa phần tử:
        names[2]  = "Hoàng";
        System.out.println("Mảng sau khi sửa: ");
        for(String str : names){
            System.out.println(str);
        }

        System.out.println("Mảng clone: ");
        String str [] = names.clone();
        for(String s : str){
            System.out.println(s);
        }
    }

    static void arrayNumber(){
        //khai báo
        int[] numbers;

        //Cấp phát bộ nhớ
        numbers = new int[5];

        numbers[0] = 2;
        numbers[1] = 8;
        numbers[2] = 5;
        numbers[3] = 7;
        numbers[4] = 1;


        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        Arrays.sort(numbers);
        System.out.println("Mảng sau khi sắp xếp: ");
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + "\t");
        }

//        Arrays.fill(numbers, 1);
//        System.out.println("\nMảng sau khi gọi hàm fill");
//        for(int i = 0; i < numbers.length; i++){
//            System.out.print(numbers[i] + "\t");
//        }

        //Chuyển mảng thành chuỗi:
        System.out.println("\nSau khi gọi toString: ");
        System.out.println(Arrays.toString(numbers));
        Main.sort(numbers);
    }

    public static void sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Mảng sau khi sắp xếp: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
    }
}
