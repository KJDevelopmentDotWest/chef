package com.epam.jwd.ingredients.rootvegetables;

import com.epam.jwd.ingredients.Vegetable;

public class Beet extends RootVegetable implements Vegetable {
    @Override
    public boolean isCanBeCooked() {
        return true;
    }

    @Override
    public int getCookingTime() {
        return 120;
    }

    @Override
    public double getCalorieContent() {
        return 11.5;
    }

    @Override
    public String getName() {
        return "Beet";
    }

    @Override
    public String getType() {
        return super.type;
    }
}
