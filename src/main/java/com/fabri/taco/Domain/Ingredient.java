package com.fabri.taco.Domain;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Table
@Data
public class Ingredient {

    @Id
    private final String id;
    private final String name;
    @Version
    private Integer version;
    private final Type type;

    public enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }

}
