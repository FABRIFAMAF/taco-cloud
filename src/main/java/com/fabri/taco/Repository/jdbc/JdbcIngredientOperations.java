package com.fabri.taco.Repository.jdbc;

import java.util.Optional;

import com.fabri.taco.Domain.Ingredient;

public interface JdbcIngredientOperations {

    Iterable<Ingredient> findAll();

    Optional <Ingredient> findById(String id);

    Ingredient save(Ingredient ingredient);
}
