package vn.techmaster;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Service {
    static String MOBILE = "0123456789";
    static String PASSWORD = "123456789";
    static Scanner sc = new Scanner(System.in);
    static long balance = 5000000;
    static List<HistoryTransaction> listHistory = new ArrayList<>();

    public static void login(){
        boolean isCheck = false;
        while(!isCheck){
            System.out.print("Nhập số điện thoại: ");
            String mobile = sc.nextLine();
            System.out.print("Nhập mật khẩu: ");
            String password = sc.nextLine();

            if(mobile.equals(MOBILE) && password.equals(PASSWORD)){
                System.out.println("Đăng nhập thành công !!!");
                isCheck = true;
            }else{
                System.out.println("Sai số điện thoại hoặc mật khẩu");
                System.out.println("Vui lòng đăng nhập lại");
            }
        }

    }

    public static void mainMenu(){
        boolean isContinue = false;
        while(!isContinue){
            Menu.menu();
            int choose = sc.nextInt();
            sc.nextLine();

            switch(choose){
                case 1:
                    System.out.println("Số dư của bạn là: " + Util.formatNumber(balance));
                    break;
                case 2:
                    transfer();
                    break;
                case 3:
                    printHistoryTransaction();
                    break;
                case 0:
                    isContinue = true;
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này!!!");
            }
         }
    }

    public static void transfer() {
       // Menu.chooseBank();
        //Nhập số tài khoản
        boolean isCheck = false;
        String account = "";
        while (!isCheck){
            try {
                account = inputAccount();
                isCheck = true;
            } catch (ValidateAccountException e) {
                System.out.println(e.getMessage());
            }
        }

        //Nhập số tiền muốn chuyển
        long moneyTransfer = inputMoney();
        sc.nextLine();

        //Nhập nội dung chuyển khoản
        System.out.println("Nhập nội dung chuyển khoản: ");
        String content = sc.nextLine();

        System.out.println("Chuyển khoản thành công");
        listHistory.add(new HistoryTransaction(account, content, moneyTransfer));
    }

    public static void printHistoryTransaction(){
        listHistory.forEach(System.out::println);
    }




    public static String inputAccount() throws ValidateAccountException {
        System.out.println("Nhập số tài khoản người nhận: ");
        String account = sc.nextLine();
        String regex = "\\d{8,16}";
        if(!Pattern.matches(regex, account)) throw new ValidateAccountException("Số tài khoản không hợp lệ");
        else{
            return account;
        }
    }

    public static long inputMoney(){
        boolean isCheck = false;
        long moneyTransfer = 0;
        while(!isCheck){
            System.out.println("Nhập số tiền cần chuyển: ");
            moneyTransfer = sc.nextLong();
            long money = balance - moneyTransfer;
            if(moneyTransfer > 50000 && money >= 50000){
                balance = money;
                isCheck = true;

            }
        }
        return moneyTransfer;

    }


}
