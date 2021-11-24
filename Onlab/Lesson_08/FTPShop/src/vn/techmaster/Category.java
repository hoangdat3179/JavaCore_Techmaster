package vn.techmaster;

public enum Category {
    PHONE ("Điện thoại"), LAPTOP ("Laptop");

    private String value;

    Category(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
