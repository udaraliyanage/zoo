package com.udara.zoo.model;

import com.udara.zoo.model.behavior.Swimable;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Duck extends Bird implements Swimable {

    public Duck(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println("Duck Swimming");
    }

    @Override
    public void shout() {
        System.out.println("Quack , quack");
    }
}
