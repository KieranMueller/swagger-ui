package com.kieran.openapidemo.controller;

import com.kieran.openapidemo.model.Cat;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cats")
public class CatController {

    @GetMapping
    public List<Cat> getAllCats() {
        return List.of(
                new Cat(1L, "Jasper", "Bombay", "Black", 4, 11.3),
                new Cat(2L, "Belfry", "Bombay", "Black", 16, 9.9),
                new Cat(3L, "Gaara", "Bombay", "Black", 8, 9.3),
                new Cat(4L, "Luna", "Bombay", "Black", 14, 7.8));
    }

    @GetMapping("{id}")
    public Cat getCatById(@PathVariable Long id) {
        return new Cat(id, "Rando", "Orange", "Orange", 5, 10D);
    }

    @PostMapping
    public List<Cat> postCats(@RequestBody List<Cat> cats) {
        return cats;
    }

    @PutMapping("{id}")
    public Cat updateCatById(@RequestBody Cat cat) {
        return new Cat(cat.getId(), cat.getName(), cat.getBreed(), cat.getColor(), cat.getAge(), cat.getWeightLbs());
    }

    @DeleteMapping("{id}")
    public Cat deleteCatById(@PathVariable Long id) {
        return new Cat(id, "DeletedName", "DeletedBreed", "DeletedColor", 0, 0D);
    }
}
