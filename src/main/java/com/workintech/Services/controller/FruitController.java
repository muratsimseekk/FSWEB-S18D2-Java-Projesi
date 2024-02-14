package com.workintech.Services.controller;

import com.workintech.Services.entity.Fruit;
import com.workintech.Services.services.FruitService;
import jakarta.validation.constraints.Size;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fruit")
public class FruitController {
    private final FruitService fruitService;

    public FruitController(FruitService fruitService) {
        this.fruitService = fruitService;
    }
    @GetMapping
    public List<Fruit> get(){
        return fruitService.getByPriceAsc();
    }

    @GetMapping("/desc")
    public List<Fruit> getDesc(){
        return  fruitService.getByPriceDesc();
    }

    @GetMapping("/{id}")
//    public FruitResponse getById(@Positive @PathVariable Long id){
//        return new FruitResponse("succeed", fruitService.getById(id));
//    }

    @PostMapping
    public Fruit save(@Validated @RequestBody Fruit fruit){
        return fruitService.save(fruit);
    }
    @GetMapping("/name/{name}")
    public List<Fruit> getByName(@Size(min = 2,max = 45) @PathVariable String name){
        return fruitService.searchByName(name);
    }

    @DeleteMapping("/{id}")
    public Fruit delete(@PathVariable Long id){
        return fruitService.delete(id);
    }
}
