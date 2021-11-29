package vn.techmaster;

import java.util.*;

public class Main {

    public static void main(String[] args) {
//        Map<Integer, String> map = new LinkedHashMap<>();
//        map.put(1, "Java");
//        map.put(5, "HTML/CSS");
//        map.put(2, "Python");
//        map.put(9, "C/C++");
//
//        for(Map.Entry<Integer, String> entry: map.entrySet()){
//            System.out.println(entry.getKey()+ " - " +entry.getValue());
//        }
//
//        map.put(1, "Ruby");
//        for(Map.Entry<Integer, String> entry: map.entrySet()){
//            System.out.println(entry.getKey()+ " - " +entry.getValue());
//        }
//
//        System.out.println("--------------------");
//        Map<Integer, String> treeMap = new TreeMap<>(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1;
//            }
//        });
//        treeMap.put(1, "Java");
//        treeMap.put(5, "HTML/CSS");
//        treeMap.put(2, "Python");
//        treeMap.put(9, "C/C++");
//
//        for(Map.Entry<Integer, String> entry: treeMap.entrySet()){
//            System.out.println(entry.getKey()+ " - " +entry.getValue());
//        }
        PersonRepository repo = new PersonRepository();
        ArrayList<Person> listPerson = repo.getListPerson();
        Map<String, Integer> listJob = new HashMap<>();


        for(int i = 0; i <listPerson.size(); i++){
            String key = listPerson.get(i).getJob();
            if(listJob.keySet().equals(listPerson.get(i).getJob())){
                listJob.put(key, listJob.get(key) + 1);
            }else{
                listJob.put(listPerson.get(i).getJob(), 1);
            }
        }

        for(Map.Entry<String, Integer> entry: listJob.entrySet()){
            System.out.println(entry.getKey()+ " - " +entry.getValue());
        }

    }
}
