package com.udara.zoo.api;

import com.udara.zoo.model.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ZooController {

    private List<Animal> animals;

    public ZooController() {
        this.animals = createAnimal();
    }

    @GetMapping(value = "/animal")
    public List<Animal> getAllAnimals(){
        return animals;
    }

    private List<Animal> createAnimal() {
        Chicken chicken = new Chicken(new HenSpeakingBehavior());
        chicken.setName("Hen Solo");
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
