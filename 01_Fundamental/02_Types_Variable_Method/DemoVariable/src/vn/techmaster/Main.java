package vn.techmaster;

public class Main {
    public int globalVariable;  //Đây là biến toàn cục

    public static void main(String[] args) {
        int localVariable;  //Đây là biến cục bộ

        //Kiểu số nguyên
        int age; //Khai báo biến age có kiểu là int
        age = 25; //Gán giá trị cho biến age
        System.out.println("Năm nay tôi " +age+" tuổi"); //in thông tin tuổi ra màn hình

        long salary = 7000000; //Khởi tạo biến salary có kiểu dữ liệu là long, có giá trị là 7000000

        //Kiểu số thực
        float weight = 40.5f; //Đối với kiểu float phải thêm vĩ ngữ là chữ f
        double height = 1.5; //Do double là kiểu mặc định cho kiểu số thực nên có thể viết gọn hơn

        //Kiểu ký tự
        char c = 'c'; //Giá trị của kiểu kí tự luôn được đặt trong cặp dấu nháy đơn
        char two = '2';
        char ch = 65; //Dựa theo bảng mã ASCII số 65 tương ứng với ký tự A

        //Kiểu luận lý
        //Kiểu luận lý chỉ nhận 2 giá trị true hoặc false
        boolean isTrue = true;
        boolean isFalse = false;
    }
}
