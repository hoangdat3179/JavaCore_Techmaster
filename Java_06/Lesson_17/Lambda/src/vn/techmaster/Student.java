package vn.techmaster;

public class Student implements IPerson{

    public Student(String name) {
        System.out.println("Gọi tới constructor");
    }



    @Override
    public void sleep(String name) {
        System.out.println(name+ " nên ngủ 8 tiếng trong một ngày");
    }
}
