package vn.techmaster;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Queue<Integer> queue =new PriorityQueue<>();
        queue.add(4); //Nếu thêm không thành cồng ném ra ngoại lệ
        queue.add(5);
        queue.add(3);
        queue.offer(6); //Nếu thêm không thành công trả false

        System.out.println("Danh sách ban đầu");
        for (Integer i: queue) {
            System.out.print(i + "\t");
        }

        System.out.println();
        System.out.println(queue.remove()); //trả về exception nếu queue rỗng
        System.out.println("Danh sách sau khi xóa");
        print(queue);

        System.out.println(queue.poll()); //trả về null nếu queue rỗng
        System.out.println("Danh sách sau khi xóa");
        print(queue);
        queue.add(1);
        System.out.println("Phần tử ở vị trí đầu tiên: "+queue.element()); //trả về exception nếu quêu rỗng
        System.out.println("Phần tử ở vị trí đầu tiên: "+queue.peek());//trả về null nếu queue rỗng
    }

    public static void print( Queue<Integer> queue){
        for (Integer i: queue) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }
}
