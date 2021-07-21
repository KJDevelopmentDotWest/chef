package com.epam.jwd.ingredients.fruitvegetables;

import com.epam.jwd.ingredients.Vegetable;

public class Tomato extends FruitVegetable implements Vegetable {
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
        return 0;
    }

    @Override
    public String getName() {
        return "Tomato";
    }

    @Override
    public String getType() {
        return super.type;
    }
}
