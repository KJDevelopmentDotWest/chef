package com.epam.jwd.ingredients.rootvegetables;

import com.epam.jwd.ingredients.Vegetable;

public class Carrot extends RootVegetable implements Vegetable {

    @Override
    public boolean isCanBeCooked() {
        return true;
    }

    @Override
    public int getCookingTime() {
        return 30;
    }

    @Override
    public double getCalorieContent() {
        return 10;
    }

    @Override
    public String getName() {
        return "Carrot";
    }

    @Override
    public String getType() {
        return super.type;
    }
}
