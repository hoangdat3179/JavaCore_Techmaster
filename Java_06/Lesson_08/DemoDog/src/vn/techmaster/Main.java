package vn.techmaster;

public class Main {

    public static void main(String[] args) {
	    Dog bull = new Dog();
        bull.breed = "Bulldog";
        bull.size = "Large";
        bull.color = "Grey";
        bull.age = 6;
        //System.out.println(bull.toString());


        Dog chow = new Dog("Chow chow", "Medium", "White", 5);
        //System.out.println(chow.toString());

//        Dog chihuahua = new Dog();
//        chihuahua.input();
        //System.out.println(chihuahua.toString());

        Dog[] arr = new Dog[3];
        arr[0] = bull;
        arr[1] = chow;
        //arr[2] = chihuahua;

        for (Dog d: arr) {
            System.out.println(d);
        }



    }
}
