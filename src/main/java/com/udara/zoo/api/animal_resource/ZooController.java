package com.udara.zoo.api.animal_resource;

import com.udara.zoo.api.animal.AnimalService;
import com.udara.zoo.model.Animal;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class ZooController {

    private AnimalService animalService;

    @GetMapping(value = "/animal")
    public List<Animal> getAllAnimals(@RequestParam Optional<String> type){

        String typeText = type.orElse("ALL").toUpperCase();
        return switch (typeText) {
            case "ALL" -> animalService.getAllAnimals();
            case "WALKING" -> animalService.getWalkingAnimals();
            case "SWIMMING" -> animalService.getSwimmingAnimal();
            case "FLYING" -> animalService.getFlyingAnimals();
            case "JUMPING" -> animalService.getJumpingAnimals();
            default -> Collections.emptyList();
        };
    }
}
