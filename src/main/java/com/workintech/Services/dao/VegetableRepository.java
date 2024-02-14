package com.workintech.Services.dao;

import com.workintech.Services.entity.Vegetable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface VegetableRepository extends JpaRepository<Vegetable,Long> {

//    List<Vegetable> getPriceByAsc();
//    List<Vegetable> getPriceByDesc();
//
//    List<Vegetable> getByName(String name);
}
