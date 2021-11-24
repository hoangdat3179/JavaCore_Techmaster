package vn.techmaster;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(3); //Thêm phần tử vào danh sách
    numbers.add(2);
    numbers.add(6);
    numbers.add(7);
    numbers.add(4);
    numbers.add(0);
    numbers.add(9);
    numbers.add(3);  //Được phép chứa phần tử trùng lặp
    System.out.println("Danh sách ban đầu: ");
    printArrayList(numbers);

    System.err.println("\n-------------------------\n");
    //Sử dụng addAll() Thêm tất cả các phần tử trong collection được chỉ định 
    //vào danh sách gọi phương thức
    ArrayList<Integer> list2 = new ArrayList<>();
    list2.addAll(numbers);
    System.err.println("List 2: ");
    printArrayList(list2);
    System.err.println("\n-------------------------\n");

    //size() Lấy kích thước ArrayList  
    System.out.println("Kích thước của list2: " + list2.size());

    System.err.println("\n-------------------------\n");

    //indexOf(Object o)
    //Lấy vị trí (index) trong danh sách với sự xuất hiện đầu tiên của phần tử được chỉ định, 
    //hoặc -1 nếu danh sách không chứa phần tử này.
    System.out.println("list2.indexOf(3): " + list2.indexOf(3));
    //lastIndexOf(Object o)
    //Lấy vị trí (index) trong danh sách với sự xuất hiện cuối cùng của phần tử được chỉ định, 
    //hoặc -1 nếu danh sách không chứa phần tử này.
    System.out.println("list2.lastIndexOf(3): " + list2.lastIndexOf(3));

    System.err.println("\n-------------------------\n");

    //get(int index) Trả về phần tử tại index đã cho
    System.out.println("list2.get(2): " + list2.get(2));

    System.err.println("\n-------------------------\n");

    //set(int index, Object o) Thay thế phần tử tại vị trí đã cho trong list này với phần tử đã xác định
    list2.set(4, 0);
    System.out.println("Danh sách sau khi thay đổi: ");
    printArrayList(list2);

    System.err.println("\n-------------------------\n");

    //remove(int index) Gỡ bỏ phần tử tại index đã cho
    list2.remove(6);
    //remove(Object o) Gỡ bỏ phần tử được chỉ định
    list2.remove(4);
    System.out.println("Danh sách sau khi xóa: ");
    printArrayList(list2);

    System.err.println("\n-------------------------\n");

    //removeAll() Loại bỏ tất cả các phần tử của ArrayListA có trong ArrayList dược chỉ định
    numbers.removeAll(list2);
    System.out.println("\nlist2: ");
    printArrayList(list2);
    System.out.println("\nnumbers: ");
    printArrayList(numbers);

    System.err.println("\n-------------------------\n");
    
    //clear() xóa toàn bộ phần tử
    list2.clear();
    System.out.println("kích thước list2 sau khi xóa toàn bộ: " + list2.size());
    
    

    }

    static void printArrayList(ArrayList<Integer> list){
        for (Integer i : list) {
            System.out.print(i + "\t");
        }
    }

    
}
