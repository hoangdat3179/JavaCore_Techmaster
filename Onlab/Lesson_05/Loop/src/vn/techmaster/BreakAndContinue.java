package vn.techmaster;

public class BreakAndContinue {

    static void sum(){
        int sum = 0;
        for(int i = 0; i <=10; i++){
            sum += i;
        }
        System.out.println("Tổng các số từ 0 đến 10 : " + sum);
    }

    static void usingBreak(){
        int sum = 0;
        for(int i = 0; i <=10; i++){
            if(i == 5) break;
            sum += i;
        }
        System.out.println("Sử dụng break: " + sum);
    }

    static void usingContinue(){
        int sum = 0;
        for(int i = 0; i <=10; i++){
            if(i == 5) continue;
            sum += i;
        }
        System.out.println("Sử dụng continue: " + sum);
    }

    static void checknumber(){
        for(int i = 1; i <=10;i++){
            if(i%2 == 0) break;
            System.out.print(i + "\t");
        }
    }

    static void reverse(){
        String str = "Hello"; //-> olleH
    }
}
