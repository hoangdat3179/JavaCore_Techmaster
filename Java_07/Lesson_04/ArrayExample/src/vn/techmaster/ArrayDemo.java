package vn.techmaster;
import java.util.Scanner;

public class ArrayDemo {

    public static void createArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập kích thước mảng: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        //Nhập phần tử
        for(int i = 0; i < n; i++){
            System.out.printf("Nhập phần tử vị trí %d: ", i );
            arr[i] = sc.nextInt();
        }

        //In mảng ra màn hình
        System.out.println("Mảng vừa nhập là: ");
        for (int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }

        System.out.println("Sử dụng for each duyệt mảng: ");
        printArray(arr);

        int sum = 0; //khởi tạo biến sum để tính tổng
        for(int i = 0; i < n; i++){
            sum = sum+arr[i]; //sau mỗi lượt lặp biến sum tăng thêm arr[i]
        }

        System.out.println("Tổng các phần tử trong mảng là: " + sum);

        System.out.println("Danh sách các số chẵn: ");
        for(int i = 0; i < n; i++){
            if(arr[i] % 2 == 0){
                System.out.println(arr[i]);
            }
        }
    }

    public static void printArray(int[] arr){
        for(int i: arr){
            System.out.println(i);
        }
    }
}
