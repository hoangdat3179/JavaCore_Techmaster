package vn.techmaster;

public enum Category {
    PHONE ("Điện thoại"),
    LAPTOP ("Laptop"),
    APPLE ("Apple"),
    ACCESSORY ("Phụ kiện");

    private String value;

    Category(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}