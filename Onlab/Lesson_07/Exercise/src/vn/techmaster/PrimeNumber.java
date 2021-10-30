package vn.techmaster;

import java.util.Random;

public class PrimeNumber {
    static final int MAX =10;

    //Phương thức kiểm tra số nguyên tố
    static boolean checkPrimeNumber(int number){
        if(number < 2){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(number); i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }

    //Liệt kê 10 số nguyên tố đầu tiên
    static void printFirstPrimeNumber(){
        int count = 0;
        for(int i = 0; count < MAX; i++){
            if (checkPrimeNumber(i)){
                System.out.print(i + "\t");
                count++;
            }
        }
    }

    //Liệt kê các số nguyên tố nhỏ hơn 10
    static void printPrimeNumber(){
        int i = 0;
        while(i < MAX){
            if (checkPrimeNumber(i)){
                System.out.print(i + "\t");
            }
            i++;
        }
    }

    static void randomNumber(){
        Random ran = new Random();
        int number = ran.nextInt(100);

        if(checkPrimeNumber(number)){
            System.out.println(number + " là số nguyên tố") ;
        }else{
            System.out.println(number + " không là số nguyên tố");
        }
    }
}
