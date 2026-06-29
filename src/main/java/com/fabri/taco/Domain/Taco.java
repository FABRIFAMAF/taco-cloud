package com.fabri.taco.Domain;

import java.util.List;

import lombok.Data;

@Data
public class Taco {
    String nombre;
    private List<Ingredient> ingredients;
}
