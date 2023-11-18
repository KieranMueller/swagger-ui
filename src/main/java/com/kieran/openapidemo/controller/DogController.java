package com.kieran.openapidemo.controller;

import com.kieran.openapidemo.model.Dog;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("dogs")
public class DogController {

    @GetMapping
    public List<Dog> getAllDogs() {
        return List.of(
                new Dog(1L, "Mike", "Lab", "Black", 4, 40.3),
                new Dog(2L, "Fido", "Poodle", "White", 16, 5.9),
                new Dog(3L, "Rex", "Corgi", "Beige", 8, 18.3),
                new Dog(4L, "Bilford", "Greyhound", "Grey", 14, 30.8));
    }

    @GetMapping("{id}")
    public Dog getDogById(@PathVariable Long id) {
        return new Dog(id, "Rando", "Lab", "Gold", 5, 30D);
    }

    @PostMapping
    public List<Dog> postDogs(@RequestBody List<Dog> dogs) {
        return dogs;
    }

    @PutMapping("{id}")
    public Dog updateDogById(@RequestBody Dog dog) {
        return new Dog(dog.getId(), dog.getName(), dog.getBreed(), dog.getColor(), dog.getAge(), dog.getWeightLbs());
    }

    @DeleteMapping("{id}")
    public Dog deleteDogById(@PathVariable Long id) {
        return new Dog(id, "DeletedName", "DeletedBreed", "DeletedColor", 0, 0D);
    }
}
