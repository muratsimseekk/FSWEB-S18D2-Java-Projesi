package com.workintech.Services.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity
@Table(name = "fruit" , schema = "fsweb")
public class Fruit extends Plant{

    @Column(name = "fruit_type")
    @NotNull
    @Enumerated(EnumType.STRING)
    private FruitType fruitType;
}
