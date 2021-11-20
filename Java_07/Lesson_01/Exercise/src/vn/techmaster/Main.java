package vn.techmaster;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Câu 1
        double a = 7;
        double b = 3;
        System.out.println("Calculator.add(a, b): "+Calculator.add(a, b));
        System.out.println("Calculator.subtract(a, b): "+Calculator.subtract(a, b));
        System.out.println("Calculator.multi(a, b): "+Calculator.multi(a, b));
        System.out.println("Calculator.div(a, b):  "+Calculator.div(a, b));

        //Câu 2

        BMI.bmiUsingVoid();
        System.out.println("Chỉ số bmi: " +BMI.bmiUsingDouble());
        System.out.println("Chỉ số bmi: " + BMI.bmiUsingDoubleWithParameters(1.5, 40));

    }
}
