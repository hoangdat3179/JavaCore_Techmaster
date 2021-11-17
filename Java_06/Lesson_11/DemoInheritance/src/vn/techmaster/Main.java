package vn.techmaster;

public class Main {

    public static void main(String[] args) {
        Developer dev = new Developer(1, "Ngọc", "ngoc@techmater.vn", "0174555", 5000000, 5);
        dev.display();

        Tester qa = new Tester(1, "Linh", "linh@gmail.com", "0147258", 6000000, 10);
        qa.display();


        //Employee emp = new Employee(1, "Linh", "linh@gmail.com", "0147258", 6000000);
    }
}
