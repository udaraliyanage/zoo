package com.udara.zoo.api.animal;

import com.udara.zoo.model.Animal;

import java.util.List;

public interface AnimalRepository {
    List<Animal> fetchAll();
}
