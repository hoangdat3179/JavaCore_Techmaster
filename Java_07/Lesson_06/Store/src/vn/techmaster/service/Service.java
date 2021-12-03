package vn.techmaster.service;
import vn.techmaster.model.Product;

import java.util.Scanner;

public class Service {

    Scanner sc = new Scanner(System.in);
    public Product[] insertProduct(){
        System.out.println("Nhập số lượng sản phẩm: ");
        int n = sc.nextInt();
        Product[] products = new Product[n];
        for(int i = 0; i < n; i++){
            System.out.printf("Nhập thông tin sản phẩm thứ %d: \n", i+1);
            System.out.println("Nhập id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Nhập tên: ");
            String name = sc.nextLine();
            System.out.println("Nhập mô tả: ");
            String description = sc.nextLine();
            System.out.println("Nhập số lượng: ");
            int amount = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập giá bán: ");
            long price = Long.parseLong(sc.nextLine());
            System.out.println("Loại sản phẩm: ");
            String category = sc.nextLine();

            Product p = new Product(id, name, description, amount, price, category );
            products[i] = p;
        }

        return products;

    }

    public void print(Product[] products){
        for (Product p: products) {
            System.out.println(p);
        }
    }

    public void searchByName(Product[] products){
        System.out.println("Nhập tên sản phẩm muốn tìm: ");
        String findName = sc.nextLine();
        for(int i = 0; i < products.length; i++){
            if(products[i].name.toLowerCase().contains(findName.toLowerCase())){
                System.out.println(products[i]);
            }
        }
    }
}
