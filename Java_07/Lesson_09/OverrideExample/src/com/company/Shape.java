package com.company;

public abstract class Shape {
    public void draw(){
        System.out.println("Vẽ hình");
    }

    public final void getName(){
        System.out.println("Đây là hình....");
    }

    public abstract void setArea();
}
