package com.udara.zoo.main;

import com.udara.zoo.model.*;

import java.util.Arrays;
import java.util.List;

public class AnimalCounter {

    public Summery count(List<Animal> animals){
        int flyableCount = 0;
        int walkableCount = 0;
        int speakableCount = 0;
        int swimableCount = 0;

        for (Animal a : animals) {
            if (a instanceof Flyable) {
                flyableCount ++;
            }
            if (a instanceof Walkable){
                walkableCount ++;
            }
            if (a instanceof Speakable) {
                speakableCount ++;
            }
            if (a instanceof Swimable){
                swimableCount ++;
            }

        }

        return new Summery(flyableCount, walkableCount, speakableCount, swimableCount);
    }

    public static void main(String[] args) {
        List<Animal> animals = Arrays.asList(
                ////new Bird(),
                new Duck(),
                new Chicken(new HenSpeakingBehavior()),
                new Chicken(new RoosterSpeakingBehavior()),
                new Parrot(new ParrotLivingWithCatSpeakingBehavior()),
                // new Fish(),
                new Shark(),
                new ClownFish(),
                new Dolphin(),
                new Frog(),
                new Dog(),
                new Butterfly(),
                new Cat()
        );

        Summery count = new AnimalCounter().count(animals);

        System.out.println(count.getFlyableCount() + " can fly");
        System.out.println(count.getWalkableCount() + " can walk");
        System.out.println(count.getSpeakableCount() + " can speak");
        System.out.println(count.getSwimableCount() + " can swim");
    }

    class Summery {

        private final int flyableCount;
        private final int walkableCount;
        private final int speakableCount;
        private final int swimableCount;

        Summery(int flyableCount, int walkableCount, int speakableCount, int swimableCount) {
            this.flyableCount = flyableCount;
            this.walkableCount = walkableCount;
            this.speakableCount = speakableCount;
            this.swimableCount = swimableCount;
        }

        public int getFlyableCount() {
            return flyableCount;
        }

        public int getWalkableCount() {
            return walkableCount;
        }

        public int getSpeakableCount() {
            return speakableCount;
        }

        public int getSwimableCount() {
            return swimableCount;
        }
    }
}
