package com.udara.zoo.model;

import com.udara.zoo.model.behavior.Speakable;
import com.udara.zoo.model.behavior.Swimable;
import com.udara.zoo.model.behavior.Walkable;

public class Cat extends Animal implements Speakable, Walkable, Swimable {

    @Override
    public void shout() {
        System.out.println("Me ow");
    }

    @Override
    public void swim() {
        System.out.println("Swimming quietly keeping head on top");;
    }
}
