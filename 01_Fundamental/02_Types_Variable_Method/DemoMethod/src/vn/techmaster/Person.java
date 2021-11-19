package vn.techmaster;

public class Person {

    //Phương thức introduce không trả về dữ liệu mà chỉ in thông tin nào đó nên sử dụng kiểu trả về là void
    //Tuy nhiên với phương thức này, nếu muốn sửa lại thông tin thì phải tìm đến phương thức để sửa
    public void introduce(){
        System.out.println("Tôi tên là Ngọc");
        System.out.println("Tôi 25 tuổi");
        System.out.println("Tôi đến từ Hà Giang");
    }

    //Với phương thức này ta truyền vào 3 tham số là name, age, address
    public void display(String name, int age, String address){
        System.out.println("Tôi tên là " + name);
        System.out.println("Tôi "+age+" tuổi");
        System.out.println("Tôi đến từ " +address);
    }
}
