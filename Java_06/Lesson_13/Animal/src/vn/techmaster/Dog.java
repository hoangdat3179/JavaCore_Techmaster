package vn.techmaster;

public class Dog extends Animal implements ICanSwim {
    public Dog(String name, int legNumber, String color) {
        super(name, legNumber, color);
    }

    @Override
    public void swim() {

    }

    @Override
    public void display() {
        super.display();
    }

    @Deprecated
    public void speed(){
        System.out.println("Tốc độ");
    }
}
