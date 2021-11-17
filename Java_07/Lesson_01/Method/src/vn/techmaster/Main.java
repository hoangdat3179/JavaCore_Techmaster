package vn.techmaster;

public class Main {

    public static void main(String[] args) {
        //Để gọi tới phương thức methodA() thì cần phải tiến hành tạo đối tượng. Cú pháp:
        //<Tên class> <Tên biến tham chiếu> = new <Tên class>();
        Main m = new Main();
        //Gọi phương thức, cú pháp:
        //<Tên biến tham chiếu>.<tên phương thức>;
        m.methodA();

        //Do methodB() được khai báo static nên không cần phải tạo đối tượng mà vẫn có thể gọi được
        methodB();
        //Lưu ý: nếu khác class thì sẽ có: <Tên class>.<Tên phương thức>();

        Person p = new Person();
        p.introduce();
        p.display("Ngọc", 25, "Hà Giang"); //các tham số truyền vào phải có kiểu tương ứng với kiểu dữ liệu của tham số của phương thức

        //Tính diện tích của hình chữ nhật
        int canhA = 5;
        int canhB = 7;
        Retangle re = new Retangle();
        //do phương thức tính diện tích có kiểu trả về là int nên ta tạo biến có kiểu cùng với kiểu trả về của phương thức để hứng kết quả
        int dienTich = re.area(canhA, canhB);
        System.out.println("Diện tích của hình chữ nhật: " +dienTich);
        //Hoặc in dữ liệu của phương thức đó trả về
        System.out.println("Chu vi của hình chữ nhật: " +re.perimeter(canhA, canhB));
    }

    public void methodA(){
        System.out.println("Phương thức A");
    }

    public static void methodB(){
        System.out.println("Phương thức B");
    }

}
