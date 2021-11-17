package vn.techmaster;

public class Output {

    public static void show(){
//        System.out.println("Xin"); //Sử dụng println tự động xuống dòng
//        System.out.println("chào");
//        System.out.println("các");
//        System.out.println("bạn");
//
//        System.out.print("Xin\t"); //Không tự động xuống dòng
//        System.out.print("chào\t");
//        System.out.print("các\t");
//        System.out.print("bạn \n");
//
//        System.out.printf("Tôi tên là %s, năm nay tôi %d tuổi, tôi nặng %.1f kg", "Ngọc", 25, 40.5);

        System.out.printf("%-5s %5s %10s\n", "Tên", "Tuổi", "Cân nặng");
        System.out.printf("%-3s %5d %9.1f\n", "Ngọc", 25, 40f);
        System.out.printf("%-3s %5d %9.1f\n", "Linh", 26, 45f);
        System.out.printf("%-4s %5d %9.1f\n", "An", 26, 50.5f);



    }
}
