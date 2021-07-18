package com.udara.zoo.model;

public class CaterpillarState implements Insect, Walkable{

    @Override
    public void fly() {
        // caterpillar does not fly;
    }

    @Override
    public void walk() {
        System.out.println("Caterpillar crawling");;
    }
}
