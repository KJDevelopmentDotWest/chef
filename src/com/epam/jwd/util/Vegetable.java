package com.epam.jwd.util;

public interface Vegetable {
    boolean isCanBeCooked();
    int getCookingTime(); //zero if cannot be cooked
    double getCalorieContent();
    String getName();
    String getType();
}
