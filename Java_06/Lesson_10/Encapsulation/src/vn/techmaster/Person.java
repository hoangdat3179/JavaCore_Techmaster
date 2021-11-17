package vn.techmaster;

public class Person implements Comparable<Person>{
    private String name;
    private int age;
    private String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    //Tính đóng gói không hoàn toàn ẩn đi dữ liệu
    //mà đề cập đến kết hợp cac thuộc tính và phương thức liên quan với nhau

    //Sử dụng setter để cập nhật giá trị cho thuộc tính (Ghi dữ liệu)
    public void setName(String name){
        this.name = name;
    }

    //Giúp kiểm soát việc sửa đổi thuộc tính dữ liệu
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }

    }

    public void setAddress(String address) {
        this.address = address;
    }

    //Sử dụng getter để lấy ra giá trị của thuộc tính (đọc dữ liệu)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return name + " - " + age + " - " + address;
    }

    private void display(){
        System.out.println("Tên tôi là " + name + ", tôi đến từ " + address);
    }

    @Override
    public int compareTo(Person o) {
        System.out.println(this.getAge() +  " - " + o.getAge());
        int compare = this.getAge() - o.getAge();
        System.out.println("Sắp xếp: " +compare);
        return compare;
    }
}
