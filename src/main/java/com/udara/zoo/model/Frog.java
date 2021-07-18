package com.udara.zoo.model;

public class Frog extends Animal implements Walkable, Speakable, Swimable, Jumpable{

    @Override
    public void jump() {
        System.out.println("I am jumping");
    }

    @Override
    public void shout() {
        System.out.println("Baka Baka");
    }

    @Override
    public void swim() {
        System.out.println("Swimming on surface of water");
    }
}
