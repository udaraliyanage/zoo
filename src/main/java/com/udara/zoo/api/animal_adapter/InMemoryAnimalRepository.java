package com.udara.zoo.api.animal_adapter;

import com.udara.zoo.api.animal.AnimalRepository;
import com.udara.zoo.model.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Component
public class InMemoryAnimalRepository implements AnimalRepository {

    @Override
    public List<Animal> fetchAll() {
        return getAnimals();
    }

    private List<Animal> getAnimals() {
        Chicken chicken = new Chicken(new HenSpeakingBehavior());
        chicken.setName("Hercules");

        Parrot parrot = new Parrot(new ParrotLivingWithCatSpeakingBehavior());
        parrot.setName("Lago");
        Chicken rooster = new Chicken(new RoosterSpeakingBehavior());
        rooster.setName("Hilary Fluff");

        return Collections.unmodifiableList(Arrays.asList(
                new Duck("Donald Duck"),
                chicken,
                rooster,
                parrot,
                new Shark("Jabberjaw"),
                new ClownFish("Garfield"),
                new Dolphin("Snoky Flakes"),
                new Frog("Hypnotoad"),
                new Dog("Astro"),
                new Butterfly("Gatekeeper"),
                new Cat("Tom")
        ));
    }
}
