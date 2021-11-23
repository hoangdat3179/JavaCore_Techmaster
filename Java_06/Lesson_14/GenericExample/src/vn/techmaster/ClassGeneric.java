package vn.techmaster;

public class ClassGeneric<T> {
    private T t;

    public ClassGeneric(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
