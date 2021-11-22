package vn.techmaster;

public class ThrowDemo {

    public static void validateAge(int age){
        if(age < 0) throw new ArithmeticException("Tuổi không được âm");
        else {
            System.out.println("Tuổi của bạn là : " +age);
        }
    }
}
