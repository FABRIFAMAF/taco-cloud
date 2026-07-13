package com.fabri.taco.Converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import com.fabri.taco.Domain.Ingredient;
import com.fabri.taco.Repository.IngredientRepository;

@Component
public class IngredientByIdConverter implements Converter<String, Ingredient> {

    private IngredientRepository ingredientRepo;

    public IngredientByIdConverter(IngredientRepository ingredientRepo) {
        this.ingredientRepo = ingredientRepo;
    }
    @Override
    public Ingredient convert(String id) {
        return ingredientRepo.findById(id).orElse(null);
    }
}

