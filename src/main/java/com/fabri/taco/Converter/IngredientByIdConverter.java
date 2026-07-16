package com.fabri.taco.Converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.fabri.taco.Domain.IngredientRef;

@Component
public class IngredientByIdConverter
        implements Converter<String, IngredientRef> {

    @Override
    public IngredientRef convert(String id) {
        return new IngredientRef(id);
    }
}