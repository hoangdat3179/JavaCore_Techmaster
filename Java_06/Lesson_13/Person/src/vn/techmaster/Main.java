package vn.techmaster;

public class Main implements Cloneable {

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
	    Student s = new Student("Ngọc", 25);
        System.out.println(s.toString());
        System.out.println(s.hashCode());

    }
}
