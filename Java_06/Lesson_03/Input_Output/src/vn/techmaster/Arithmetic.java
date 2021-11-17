package vn.techmaster;

import java.util.Random;

public class Arithmetic {
    static void classMath (){
        System.out.println("Số pi: " +Math.PI);
        System.out.println("Số 5.6 làm tròn tăng: " + Math.ceil(5.6));
        System.out.println("Số 5.6 làm tròn giảm: " + Math.floor(5.6));
        System.out.println("Số lớn nhất trong hai số 7 và 8: " + Math.max(7,8));
        System.out.println("Số nhỏ nhất trong hai số 7 và 8: " + Math.min(7,8));
        System.out.println("5 mũ 7 = " + Math.pow(5, 7) );
        System.out.println("Căn bâc hai của 25= " +Math.sqrt(25));
        System.out.println("Số ngẫu nhiên từ 0 đến 1: " + Math.random());

        Random random = new Random();
        System.out.println("Số ngẫu nhiên: " +random.nextInt(100));
        System.out.println("Số ngẫu nhiên: " +random.nextDouble());

        int num = random.nextInt((100 - 90)+1)+90;
        System.out.println("Các số ngẫu nhiên từ 90 đến 100: " +num);

    }
}
