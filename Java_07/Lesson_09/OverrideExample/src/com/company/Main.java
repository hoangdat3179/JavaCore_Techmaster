package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Square sq = new Square();
//        sq.draw();
//
//        //upcasting
//        Shape s1 = new Square();
//        s1.draw();
//
//        //Downcasting
//        Shape s2 = new Square();
//        Square s3 = (Square) s2;  //ép kiểu
//
//        Square s4 = new Square();
        Circle c = new Circle(4) ;
        c.setArea();

        Square s = new Square(5);
        s.setArea();

    }
}
