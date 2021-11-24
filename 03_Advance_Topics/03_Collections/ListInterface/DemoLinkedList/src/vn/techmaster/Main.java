package vn.techmaster;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Employee> employees = new LinkedList<>();
        employees.add(new Employee("John", "john@gmail.com", "0147258369", 8000000));
        employees.add(new Employee("Anna", "anna@gmail.com", "0123456789", 9000000));
        employees.add(new Employee("Victor", "victor@gamil.com", "0159357456", 5000000));
        employees.add(new Employee("Emma", "emma@gmail.com", "0246813579", 7000000));

        for (Employee employee: employees) {
            System.out.println(employee);
        }

    }

}
