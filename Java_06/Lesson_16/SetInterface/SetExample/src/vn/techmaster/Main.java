package vn.techmaster;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Set<Integer> set = new HashSet<>();
        set.add(4);
        set.add(3);
        set.add(5);
        set.add(9);
        set.add(4);

        System.out.println(set);



        Set<Integer> lhSet = new LinkedHashSet<>();
        lhSet.add(4);
        lhSet.add(3);
        lhSet.add(5);
        lhSet.add(9);
        lhSet.add(4);
        System.out.println(lhSet);

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(4);
        treeSet.add(3);
        treeSet.add(5);
        treeSet.add(9);
        treeSet.add(4);
        System.out.println(treeSet);
        System.out.println(treeSet.descendingSet());

    }
}
