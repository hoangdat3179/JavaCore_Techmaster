package vn.techmaster;

public class Main {

    public static void main(String[] args) {
	    //Tạo chuỗi bằng String literal
        String str1 = "Thanh Ngọc";
        //Tạo chuỗi bằng từ khóa new
        String str2 = new String("thanh ngọc");

        //Một số phương thức của class String
        //Lấy kích thước chuỗi
        System.out.println("Kích thước chuỗi: " + str1.length());
        //Viết in hoa toàn bộ chuỗi
        System.out.println(str1.toUpperCase());

        //Viết thường toàn bộ chuỗi
        System.out.println(str1.toLowerCase());

        //Kiểm tra chuỗi có rỗng không
        System.out.println("Chuỗi có rỗng không: " + str1.isEmpty());

        //So sánh hai chuỗi
        //equals() phân biệt chữ hoa thường
        System.out.println("str1.equals(str2): "+str1.equals(str2) );

        //equalsIgnoreCase() không phân biệt chữ hoa thường
        System.out.println("str1.equalsIgnoreCase(str2): "+str1.equalsIgnoreCase(str2));

        String str3 = "Ngọc";
        System.out.println("Chuỗi str3 có nằm trong str1 không: " + str1.contains(str3));

    }
}
