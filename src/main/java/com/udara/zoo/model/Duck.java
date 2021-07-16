package com.udara.zoo.model;

public class Duck extends Bird implements Swimmable{

    @Override
    public void swim() {
        System.out.println("Duck Swimming");
    }

    @Override
    public void shout() {
        System.out.println("Quack , quack");
    }
}
