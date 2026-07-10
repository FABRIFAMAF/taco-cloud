package com.fabri.taco.Domain;

import java.util.List;

import lombok.Data;

@Data
public class Taco {
    String name;
    private List<Ingredient> ingredients;
}
