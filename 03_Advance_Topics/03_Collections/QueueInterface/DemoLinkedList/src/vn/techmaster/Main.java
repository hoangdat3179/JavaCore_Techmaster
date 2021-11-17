package vn.techmaster;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
	    //Khởi tạo LinkedList
        Queue<Integer> numbers = new LinkedList<>();

        //Thêm phần tử
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.offer(25);

        System.out.println("Danh sách đầu tiên: ");
        for (Integer i: numbers) {
            System.out.print(i + "\t");
        }

        //Lấy phần tử đầu tiên
        System.out.println("\nPhần tử đầu tiên: " + numbers.peek());

        //Lấy ra phần tử đầu tiên và xóa phần tử đó
        System.out.println("Phần tử đầu tiên: " +numbers.poll());
        System.out.println("Danh sách sau khi xóa: ");
        for (Integer i: numbers) {
            System.out.print(i + "\t");
        }
    }
}
