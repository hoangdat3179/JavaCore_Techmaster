package vn.techmaster;

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
