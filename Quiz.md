1. Class abstract có thể sử dụng cú pháp non abstract?  
a. Đúng  
b. Sai  

2. Vòng lặp `do while` khác vòng lặp `while` ở điểm nào?   
a. `do while` luôn thực hiện khối lệnh ít nhất 1 lần  
b. `while` cho phép thực thi khối lệnh ngay cả khi điều kiện sai  
c. Không có điểm khác nhau  

3. Synchronized là từ khóa được dùng để Thread chọn một đối tượng bất kỳ đã được khóa trước khi tiếp tục thực thi lệnh?  
a. Đúng  
b. Sai  

4. Cho biết kết quả của câu lệnh sau: 
```java
public class Main{
    public static void main(String []args){
        int x = 12;
        String result = (x % 3 == 0) ? x + " chia hết cho 3" : x + " không chia hết cho 3";
        System.out.println(result);
    }
}
```
a. 12 chia hết cho 3  
b. 12 không chia hết cho 3  
c. Lỗi chương trình  

5. Cho biết kết quả của chương trình sau:
```java
public class Main{
    public static void main(String []args){
        String name[] = {"John","Anna","Peter","Victor"};
        System.out.println(names[2]);
    }
}
```
a. John  
b. Anna  
c. Peter  
d. Victor  
  

6. Để đảo giá trị của một biến boolean, ta sử dụng toán tử:  
a. !  
b. >>  
c. <<  
d. >>>  

9. Cho biết kết quả thực thi của chương trình sau:
```java
public class Main {
    public static void main(String []args){
        String expletive = "Expletive";
        String PG13 = "deleted";
        String message = expletive.substring(1,3) + PG13;
        System.out.println(message);
    }
}
```
a. xpl deleted  
b. Exp edeleted  
c. ple deleted  
d. xpldeleted  

8. Cho biết kết quả của chương trình sau:
```java
public class Student {
    public int getAge(){
        return 10;
    }
}
public class Main {
    public static void main(String []args){
        Student student = new Student();
        System.out.println(student.getAge());
    }
}
```
a. 10  
b. 11  
c. Lỗi chương trình  