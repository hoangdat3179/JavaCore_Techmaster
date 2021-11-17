import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PersonRepository repo = new PersonRepository();
        ArrayList<Person> list = repo.getData();
        repo.printList(list);


        //System.out.println("list.get(5):  " +list.get(5)) ;
    }
}
