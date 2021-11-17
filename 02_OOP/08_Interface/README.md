## Interface là gì?
Interface là một kiểu dữ liệu tham chiếu trong Java. Nó tập hợp các phương thức abstract. Khi một lớp kế thừa interface, nó sẽ kế thừa những phương thức abstract của interface đó.   
Interface ra đời nhằm hỗ trợ đa kế thừa. Ngoài ra, interface sẽ giúp đồng bộ và thống nhất trong việc phát triển hệ thống trao đổi thông tin 

**Đặc điểm của interface:**    
- Không thể tạo đối tượng từ một interface, do đó interface không có constructor    
- Tất cả  các phương thức trong interface luôn ở dụng public abstract mà không cần khai báo  
- Các thuộc tính trong interface luôn ở dạng public static final mà không cần khai báo  

**Tại sao nên sử dụng interface:**  
- Interface được sử dụng nhằm đạt được sử trừu tượng  
- Hỗ trợ chức năng đa kế thừa
- Sử dụng để đạt loose coupling
</br>  

![image](../image/why-use-java-interface.jpg)

## Khai báo và sử dụng interface  
**Cú pháp:**
```java
interface <tên interface>{
    //Các thành phần trong interface
}
```
</br>

*Ví dụ:*   

Tạo Interface `Drawable`. Trong interface này có một phương thức abstract `draw()`   
```java
public interface Drawable {
    void draw();
}
```

Tạo 2 class `Retangle` và `Circle` kế thừa interface `Drawable` và override phương thức `draw()`. Đối với interface thay vì sử dụng `extends`, ta sử dụng `implements` 
```java
public class Rectangle implements Drawable{
    @Override
    public void draw() {
        System.out.println("Vẽ hình tam giác");
    }
}
```
```java
public class Circle implements Drawable{
    @Override
    public void draw() {
        System.out.println("Vẽ hình tròn");
    }
}
```

Giờ hãy cùng kiểm tra interface chúng ta vừa tạo:  
```java
public class Main {
    public static void main(String[] args) {
	    Drawable d = new Circle();
        d.draw();
    }
}
```

</br>

## Đa kế thừa trong interface  
Trong java, các class thông thường thì không cho phép đa kế thừa. Thế nhưng trong interface chúng ta có thể kế thừa nhiều interface  
*Ví dụ:*  
Tạo 2 interface:  
```java
public interface IAnimalEat {
    void eat();
}
```  
```java
public interface IAnimalTravel {
    void travel();
}
```
Tạo class `Animal` implements hai interface vừa tạo  
```java
public class Animal implements IAnimalEat, IAnimalTravel {

    @Override
    public void eat() {
        System.out.println("Animal is eating");
    }

    @Override
    public void travel() {
        System.out.println("Animal is travelling");
    }
}
```
Giờ hãy cũng kiểm tra:  
```java 
public class Main {
    public static void main(String[] args) {
	    Animal animal = new Animal();
        animal.eat();
        animal.travel();
    }
}
```