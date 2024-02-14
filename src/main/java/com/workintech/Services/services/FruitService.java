package com.workintech.Services.services;

import com.workintech.Services.entity.Fruit;

import java.util.List;

public interface FruitService {

    List<Fruit> getByPriceAsc();

    Fruit getById(long id);

    List<Fruit> getByPriceDesc();
    Fruit save(Fruit fruit);

    Fruit delete(long id);

    List<Fruit> searchByName(String name);
}
