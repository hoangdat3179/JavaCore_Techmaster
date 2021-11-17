package vn.techmaster;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //whileLoop();
        //randomNumber();
        //doWhileLoop();
        BreakAndContinue.sum();
        BreakAndContinue.usingBreak();
        BreakAndContinue.usingContinue();
        BreakAndContinue.checknumber();

    }


    static void forLoop(){
        for(int i = 0; i <= 10; i++){
            if(i % 2 == 0){
                System.out.print(i +"\t");
            }
        }
    }

    static void whileLoop(){
        int i = 10;
        while(true){
            System.out.println("Xin chào!!!");
            i--;
        }
    }

    static void doWhileLoop(){
        int i = 9;
        do{
            System.out.println("Xin chào!!!");
            i++;
        }while(i == 10);
    }

    static void randomNumber(){
        Random ran = new Random();
        int ranNumber = ran.nextInt(100);
        Scanner sc = new Scanner(System.in);
        int count = 1;

        int i = 0;
        boolean isCheck = false;
        while(!isCheck){
            System.out.println("Nhập số bất kỳ: ");
            i = sc.nextInt();
            if(i == ranNumber) {
                System.out.println("Bạn đoán đúng rồi");
                isCheck = true;
            }else if(i < ranNumber){
                System.out.println("Bạn đoán nhỏ hơn rồi");
                count ++;
            }else{
                System.out.println("Bạn đoán lớn hơn rồi");
                count++;
            }
        }
        System.out.println("Số lần đoán: " + count);
    }
}
