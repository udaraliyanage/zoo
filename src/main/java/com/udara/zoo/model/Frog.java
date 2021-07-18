package com.udara.zoo.model;

import com.udara.zoo.model.behavior.Jumpable;
import com.udara.zoo.model.behavior.Speakable;
import com.udara.zoo.model.behavior.Swimable;
import com.udara.zoo.model.behavior.Walkable;

public class Frog extends Animal implements Walkable, Speakable, Swimable, Jumpable {

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
