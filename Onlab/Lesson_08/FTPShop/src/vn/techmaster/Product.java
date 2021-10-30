package vn.techmaster;

import java.text.DecimalFormat;

public class Product {
    int id;
    String name;
    long price;
    Category category;
    String brand;

    public Product(int id, String name, long price, Category category, String brand) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + formatMoney(price) + " - " + category.getValue() +" - " +brand + " - " + formatMoney(totalprice(4));
    }

    //Định dạng số tiền thao mong muốn
    public String formatMoney(long money){
        DecimalFormat formatter = new DecimalFormat("###,###,###");
        return formatter.format(money);
    }

    public long totalprice(int amount){
        return amount*price;
    }
}
