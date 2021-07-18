package com.udara.zoo;

import com.udara.zoo.model.*;

import java.util.List;

public class AnimalCount {

    private static int flyableCount;
    private static int walkableCount;
    private static int speakableCount;
    private static int swimableCount;

    private void count(List<Animal> animals){
        for (Animal a : animals) {
            if (a instanceof Flyable) {
                flyableCount ++;
            }
            if (a instanceof Walkable){
                walkableCount ++;
            }
            if (a instanceof Speakable) {
                speakableCount++;
            }
            if (a instanceof Swimable){
                swimableCount++;
            }

        }
    }

    public static void main(String[] args) {
        Animal[] animals = new Animal[]{
////                new Bird(),
                new Duck(),
                new Chicken(new HenSpeakingBehavior()),
                new Chicken(new RoosterSpeakingBehavior()),
                new Parrot(new ParrotLivingWithCatSpeakingBehavior()),
////                new Fish(),
                new Shark(),
                new ClownFish(),
                new Dolphin (),
                new Frog(),
                new Dog(),
                new Butterfly(),
                new Cat()
        };


        System.out.println(flyableCount + " can fly");
        System.out.println(walkableCount + " can walk");
        System.out.println(speakableCount + " can speak");
        System.out.println(swimableCount + " can swim");
    }
}
