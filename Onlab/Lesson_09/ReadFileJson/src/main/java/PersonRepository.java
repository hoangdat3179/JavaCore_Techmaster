import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class PersonRepository {

    public ArrayList<Person> getData(){
        ArrayList<Person> listPerson = new ArrayList<>();


        try {
            //Khởi gson
            Gson gson = new Gson();

            //Đọc file
            FileReader reader = new FileReader("src/person.json");

            //Lấy ra kiểu mong muốn được convert sang
             Type objectType = new TypeToken<ArrayList<Person>>(){}.getType();
            //System.out.println(objectType);

            listPerson = gson.fromJson(reader, objectType);

//            for (Person p: listPerson) {
//                System.out.println(p);
//            }
         }catch (FileNotFoundException e){
            System.out.println("Không tìm thấy file");
        }

        return listPerson;
    }

    public void printList(ArrayList<Person> list){
        for (Person p: list) {
                System.out.println(p);
            }
    }
}
