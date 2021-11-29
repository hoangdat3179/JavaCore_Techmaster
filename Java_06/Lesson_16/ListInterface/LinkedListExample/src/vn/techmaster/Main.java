package vn.techmaster;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
	    List<String> list = new LinkedList<>();
        list.add("Linh");
        list.add("Hùng");
        list.add("Hoa");

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addFirst("Hoàng");
        linkedList.addLast("Tuấn");

        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        Vector<String> vector = new Vector<>();
    }
}
