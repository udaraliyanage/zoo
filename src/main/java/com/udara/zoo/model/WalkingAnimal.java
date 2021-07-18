package com.udara.zoo.model;

import com.udara.zoo.model.behavior.Speakable;
import com.udara.zoo.model.behavior.Walkable;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public abstract class WalkingAnimal extends Animal implements Speakable, Walkable {

    public WalkingAnimal(String name) {
        super(name);
    }

}
