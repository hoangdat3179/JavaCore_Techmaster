package vn.techmaster;

public class Main {

    public static void main(String[] args) {
	    //Product phone = new Product(1, "iPhone 13 Pro Max 128GB", 33990000, Category.PHONE, "iPhone");
        Product laptop = new Product(2, "Dell G3 15 3500B", 31999000, Category.LAPTOP, "Dell");

        Product [] products = new Product[2];
        products[0] = new Product(1, "iPhone 13 Pro Max 128GB", 33990000, Category.PHONE, "iPhone");
        products[1] = laptop;

        for (Product p : products) {
            System.out.println(p);
        }
    }
}
