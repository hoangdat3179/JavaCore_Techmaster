package vn.techmaster;

public class ValidateEmail {

    public static boolean validateEmail(String email){
        String EMAIL_REGEX = "^(.+)@(.+)$";
        boolean isCheck = email.matches(EMAIL_REGEX);
        return isCheck;
    }

    public static void checkEmail(){
        String email = "ngoc@techmaster.vn";
        if (validateEmail(email)) {
            System.out.println(email + " hợp lệ");
        }else{
            System.out.println(email + " không hợp lệ");
        }
    }
}
