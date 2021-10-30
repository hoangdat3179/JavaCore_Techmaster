package vn.techmaster;
import java.util.Scanner;

public class MultiArray {

    public static int[][] createArray(int arr[][], int row, int col){

        Scanner sc = new Scanner(System.in);
        arr = new int[row][col];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.printf("Nhập arr[%d][%d]: ", i,j);
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    public static void printArray(int arr[][]){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j <arr[i].length; j++){
                System.out.print(arr[i][j] +"\t");
            }
            System.out.println();
        }

    }
    public static void findDiagonal(int arr[][], int row, int col){
        if(row == col){
            System.out.println("Đường chéo chính của ma trận là: ");
            for(int i = 0; i < arr.length; i++){
                for(int j = 0; j < arr[i].length; j++){
                    if(i == j){
                        System.out.print(arr[i][j] + "\t");
                    }
                }
            }
        }
        else{
            System.out.println("Đây không phải ma vuông, không có đường chéo chính");
        }
    }
}
