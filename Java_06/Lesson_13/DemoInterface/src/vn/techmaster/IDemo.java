package vn.techmaster;

@FunctionalInterface
public interface IDemo {
    void print();

    default double area(int a, int b){
        return (double) a*b;
    }

}
