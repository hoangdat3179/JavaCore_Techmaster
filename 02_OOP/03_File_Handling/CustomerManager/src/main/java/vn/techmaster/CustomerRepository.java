package vn.techmaster;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class CustomerRepository {

    //Đọc file
    public ArrayList<Customer> getData(){
        ArrayList<Customer> listCustomer = new ArrayList<>();
        try {
            Gson gson = new Gson(); //Khởi tạo gson
            FileReader reader = new FileReader("customer.json");
            //Chuyển từ Json text -> object
            Type objectType = new TypeToken<ArrayList<Customer>>(){}.getType();
            //System.out.println(objectType);
            //TypeToken là một inner class rỗng. Giúp đảm bảo Gson biết chính xác kiểu mong muốn khi convert

            //parse gson về object
            listCustomer = gson.fromJson(reader, objectType);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return listCustomer;
    }

    public void printList(ArrayList<Customer> list){
        for (Customer customer: list) {
            System.out.println(customer);
        }
    }


}
