package vn.techmaster;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> listCustomer = new ArrayList<>();
        CustomerRepository repo = new CustomerRepository();
        listCustomer = repo.getData();
        repo.printList(listCustomer);

    }
}
