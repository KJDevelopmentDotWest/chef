package com.epam.jwd.ingredients.bulbvegetables;

import com.epam.jwd.ingredients.Vegetable;

public class Garlic extends BulbVegetable implements Vegetable {
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
        return 2;
    }

    @Override
    public String getName() {
        return "Garlic";
    }

    @Override
    public String getType() {
        return super.type;
    }
}
