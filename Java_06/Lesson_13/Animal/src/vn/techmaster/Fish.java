package vn.techmaster;

public class Fish extends Animal implements ICanSwim {
    public Fish(String name, int legNumber, String color) {
        super(name, legNumber, color);
    }


    @Override
    public void swim() {

    }
}
