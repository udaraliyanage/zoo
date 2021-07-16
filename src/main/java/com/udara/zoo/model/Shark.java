package com.udara.zoo.model;

import static com.udara.zoo.model.Colour.GREY;
import static com.udara.zoo.model.Size.LARGE;

public class Shark extends Fish {

    public Shark() {
        super(LARGE, GREY);
    }

    public void eat(Fish fish){
        System.out.println("What a yummy meal");
    }
}
