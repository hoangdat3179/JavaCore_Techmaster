package vn.techmaster;

public class BMICalcuator {

    public static void bmi(double height, double weight) throws MyException{
        if(height < 0 || height > 2.5) throw new MyException("Chiều cao không hợp lệ");

        if(weight < 0 || weight > 300) throw new MyException("Cân nặng không hợp lệ");

        double bmi = weight/(height*height);

        System.out.println("Chỉ số bmi của bạn là: " + bmi);
    }
}
