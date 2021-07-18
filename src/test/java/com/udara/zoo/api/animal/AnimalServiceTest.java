package com.udara.zoo.api.animal;

import com.udara.zoo.model.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class AnimalServiceTest {

    @InjectMocks
    private AnimalService service;

    @Mock
    private AnimalRepository repository;

    @Before
    public void setUp(){
        when(repository.fetchAll()).thenReturn(getAnimals());
    }

    @Test
    public void testShouldFetchAllAnimals() {
        assertEquals(11, service.getAllAnimals().size());
    }

    @Test
    public void testShouldFetchWalkingAnimals() {
        assertEquals(8, service.getWalkingAnimals().size());
    }

    @Test
    public void testShouldFetchSwimmingAnimals() {
        assertEquals(7, service.getSwimmingAnimal().size());
    }

    @Test
    public void testShouldFetchFlyingAnimals() {
        assertEquals(3, service.getFlyingAnimals().size());
    }

    @Test
    public void testShouldFetchJumpingAnimals() {
        assertEquals(1, service.getJumpingAnimals().size());
    }

    private List<Animal> getAnimals() {
        Chicken chicken = new Chicken(new HenSpeakingBehavior());

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