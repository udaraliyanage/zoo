package com.udara.zoo.api.animal;

import com.udara.zoo.model.Animal;
import com.udara.zoo.model.behavior.Flyable;
import com.udara.zoo.model.behavior.Jumpable;
import com.udara.zoo.model.behavior.Swimable;
import com.udara.zoo.model.behavior.Walkable;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class AnimalService {

    private AnimalRepository repo;

    public List<Animal> getAllAnimals() {
        return filterAnimals(animal -> true);
    }

    public List<Animal> getWalkingAnimals() {
        return filterAnimals(animal -> animal instanceof Walkable);
    }

    public List<Animal> getFlyingAnimals() {
        return filterAnimals(animal -> animal instanceof Flyable);
    }

    public List<Animal> getSwimmingAnimal() {
        return filterAnimals(animal -> animal instanceof Swimable);
    }

    public List<Animal> getJumpingAnimals() {
        return filterAnimals(animal -> animal instanceof Jumpable);
    }

    private List<Animal> filterAnimals(Predicate<Animal> p) {
        return repo.fetchAll().stream().filter(p).collect(Collectors.toList());
    }
}
