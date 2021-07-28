package com.epam.jwd.ingredient;

public interface Vegetable {
    boolean isCanBeCooked();
    int getCookingTime(); //zero if cannot be cooked
    double getCalorieContent();
    String getName();
    String getType();
}
