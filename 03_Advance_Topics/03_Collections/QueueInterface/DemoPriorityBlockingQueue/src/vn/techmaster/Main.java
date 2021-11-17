package vn.techmaster;

import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class Main {

    public static void main(String[] args) {
        Queue<Integer> numbers = new PriorityBlockingQueue<>();
        numbers.add(9);
        numbers.add(4);
        numbers.add(6);
        numbers.add(7);

        System.out.println("Danh sách ban đầu: ");
        System.out.println(numbers);

        System.out.println("\nPhần tử đầu tiên: " + numbers.poll());

        numbers.offer(1);
        System.out.println("Danh sách sau khi thêm: ");
        System.out.println(numbers);

        System.out.println("Phần tử đầu tiên : " +numbers.peek());
    }
}
