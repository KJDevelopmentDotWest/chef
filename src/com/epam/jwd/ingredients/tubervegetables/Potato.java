package com.epam.jwd.ingredients.tubervegetables;

import com.epam.jwd.ingredients.Vegetable;

public class Potato extends TuberVegetable implements Vegetable {

    @Override
    public boolean isCanBeCooked() {
        return true;
    }

    @Override
    public int getCookingTime() {
        return 60;
    }

    @Override
    public double getCalorieContent() {
        return 5;
    }

    @Override
    public String getName() {
        return "Potato";
    }

    @Override
    public String getType() {
        return super.type;
    }
}
