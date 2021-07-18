package com.udara.zoo.api.animal_resource;

import com.udara.zoo.api.animal.AnimalService;
import com.udara.zoo.model.Animal;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class ZooController {

    private AnimalService animalService;

    @GetMapping(value = "/animal")
    public List<Animal> getAllAnimals(){
        return animalService.getAllAnimals();
    }

    @GetMapping("/animal/walking")
    public List<Animal> getWalkingAnimals(){
        return animalService.getWalkingAnimals();
    }

    @GetMapping("/animal/flying")
    public List<Animal> getFlyingAnimals(){
        return animalService.getFlyingAnimals();
    }

    @GetMapping("/animal/swimming")
    public List<Animal> getSwimingAnimals(){
        return animalService.getSwimmingAnimal();
    }

    @GetMapping("/animal/jumping")
    public List<Animal> getJumpingAnimals(){
        return animalService.getJumpingAnimals();
    }
}
