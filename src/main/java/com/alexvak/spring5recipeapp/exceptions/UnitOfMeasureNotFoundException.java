package com.alexvak.spring5recipeapp.exceptions;

public class UnitOfMeasureNotFoundException extends RuntimeException {

    public UnitOfMeasureNotFoundException(String id) {
        super("Unit of measure not found. Id: " + id);
    }
}
