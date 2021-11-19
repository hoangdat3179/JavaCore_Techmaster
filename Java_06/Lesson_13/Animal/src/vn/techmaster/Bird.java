package vn.techmaster;

public class Bird extends Animal implements ICanFly{
    public Bird(String name, int legNumber, String color) {
        super(name, legNumber, color);
    }

    @Override
    public void fly() {

    }
}
