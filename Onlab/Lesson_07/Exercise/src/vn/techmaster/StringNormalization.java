package vn.techmaster;

public class StringNormalization {
    static String replaceSpace(String str){
        str = str.trim();  //Loại bỏ khoảng tắng ở đầu và cuối chuỗi

        str = str.replaceAll("\\s+" , " ");
        return str;
    }

    static String standardize(String str){
        str = replaceSpace(str);

        String temp[] = str.split(" "); //cắt chuỗi
        str = "";
        for(int i = 0; i < temp.length; i++){
            str += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
            if (i < temp.length - 1)
                str += " ";
        }
        return str;
    }

    static void isPalindrome(String str){
        String reverse = "";
        for(int i = str.length() - 1; i >= 0; i--){
            reverse = reverse + str.charAt(i);

        }
        if(str.equals(reverse)){
            System.out.println(str + " là chuỗi palindrome");
        }else{
            System.out.println(str +" không phải chuỗi palindrome");
        }
    }
}
