package com.fabri.taco.Repository;

import java.util.Optional;

import com.fabri.taco.Domain.Ingredient;

public interface IngredientRepository {

    Iterable<Ingredient> findAll();

    Optional<Ingredient> findById(String id);
    
    Ingredient save(Ingredient ingredient);
    
}
