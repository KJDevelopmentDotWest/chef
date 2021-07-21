package com.epam.jwd.ingredients.tubervegetables;

import com.epam.jwd.ingredients.Vegetable;

public class Artichoke extends TuberVegetable implements Vegetable {

    @Override
    public boolean isCanBeCooked() {
        return false;
    }

    @Override
    public int getCookingTime() {
        return 0;
    }

    @Override
    public double getCalorieContent() {
        return 7;
    }

    @Override
    public String getName() {
        return "Artichoke";
    }

    @Override
    public String getType() {
        return super.type;
    }
}
