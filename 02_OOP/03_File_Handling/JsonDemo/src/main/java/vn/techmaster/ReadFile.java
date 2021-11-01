package vn.techmaster;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    public void getData()  {

        //1, Tạo JSONParser để phân tích tệp json
        JSONParser parser = new JSONParser();

        //Sử dụng FileReader để đọc file json và chuyển nó cho phần phân tích cú pháp
        try(FileReader reader = new FileReader("person.json")) {

            //Đọc file
            Object obj = parser.parse(reader);

            JSONArray personList = (JSONArray) obj;  //JSONArray: để ghi dữ liệu trong mảng json

            for (Object person: personList) {
                parseCustomerObject((JSONObject)person);  
            }


        }catch(IOException e){
            e.printStackTrace();
        }catch (ParseException e){
            e.printStackTrace();
        }

    }

    private static void parseCustomerObject(JSONObject jsonObject){
        String name = (String) jsonObject.get("name");
        Long age = (Long) jsonObject.get("age");
        String address = (String) jsonObject.get("address");

        System.out.println(name + " - " + age + " - " + address);
    }
}
