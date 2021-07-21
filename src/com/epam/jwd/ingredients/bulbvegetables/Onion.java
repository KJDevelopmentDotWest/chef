package com.epam.jwd.ingredients.bulbvegetables;

import com.epam.jwd.ingredients.Vegetable;

public class Onion extends BulbVegetable implements Vegetable {
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
        return 3;
    }

    @Override
    public String getName() {
        return "Onion";
    }

    @Override
    public String getType() {
        return super.type;
    }
}
