package vn.techmaster;

import java.util.List;
import java.util.Vector;

public class VectorExample {
    public List createVector(){
        List<String> animal = new Vector<>();
        animal.add("Dog");  //Thêm phần tử vào vector
        animal.add("Cat");
        animal.add("Bear");
        animal.add("Cat");

        animal.add(1, "Fish"); //Thêm phần tử vào index được chỉ định
        return animal;
    }

    public void print(List<String> animal){
        for (String str: animal) {
            System.out.println(str);
        }
    }
}
