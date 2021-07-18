package com.udara.zoo.model;

import static com.udara.zoo.model.Colour.ORANGE;
import static com.udara.zoo.model.Size.SMALL;

public class ClownFish extends Fish {

    public ClownFish() {
        super(SMALL, ORANGE);
    }

    public ClownFish(String name) {
        super(SMALL, ORANGE, name);
    }

    public void makeJoke(){
        System.out.println("Where do fish sleep, on water bed!");
    }
}
