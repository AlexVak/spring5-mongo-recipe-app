package com.alexvak.spring5recipeapp.exceptions;

public class IngredientNotFoundException extends RuntimeException {

    public IngredientNotFoundException(String id) {
        super("Ingredient not found. Id: " + id);
    }
}
