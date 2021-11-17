package vn.techmaster;

public class MultiArray {
    static void input(){
        int [][] numbers = new int[3][3];
        numbers[0][0] = 5;
        numbers[0][1] = 8;
        numbers[0][2] = 4;
        numbers[1][0] = 6;
        numbers[1][1] = 7;
        numbers[1][2] = 1;
        numbers[2][0] = 2;
        numbers[2][1] = 3;
        numbers[2][2] = 6;


        for(int row = 0; row < numbers.length; row++){
            for(int col = 0; col < numbers[row].length; col ++){
                System.out.print(numbers[row][col] + "\t");
            }
            System.out.println();
        }
    }
}
