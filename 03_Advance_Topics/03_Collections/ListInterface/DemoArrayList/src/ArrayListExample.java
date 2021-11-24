import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

    public static List createArrayList(List<String> list){
        list.add("Dog");  //Thêm phần tử vào ArrayList
        list.add("Cat");
        list.add("Mouse");

        list.add(1, "Bear");

        return list;
    }

    public static void printList(List<String> list){
        System.out.println("Danh sách động vật: ");
        for(int i = 0; i < list.size(); i++){  //size() lấy kích thước ArrayList
            System.out.println(list.get(i));  //get(int index)  lấy ra phần tử ở vị trí index
        }

        //Sử dụng foreach
        System.out.println("Sử dụng foreach: ");
        for (String animal: list) {
            System.out.println(animal);
        }

        //Sử dụng Iterator
        System.out.println("Sử dụng iterator");
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
