package com.workintech.Services.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity
@Table(name = "vegetable" , schema = "fsweb")
public class Vegetable extends Plant{

    @Column(name = "is_grown_on_tree")
    private Boolean isGrownOnTree;
}
