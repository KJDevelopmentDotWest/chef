package com.epam.jwd.ingredient.rootvegetable;

import com.epam.jwd.ingredient.Vegetable;

public class Carrot extends RootVegetable implements Vegetable {

    private static final String NAME = "Carrot";
    private static final int CALORIE_CONTENT = 10;
    private static final int COOKING_TIME = 30;
    private static final boolean CAN_BE_COOKED = true;

    @Override
    public boolean isCanBeCooked() {
        return CAN_BE_COOKED;
    }

    @Override
    public int getCookingTime() {
        return COOKING_TIME;
    }

    @Override
    public double getCalorieContent() {
        return CALORIE_CONTENT;
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public String getType() {
        return TYPE;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof RootVegetable) return NAME.equals(((RootVegetable) obj).getName());
        else return false;
    }

    @Override
    public int hashCode() {
        return NAME.hashCode();
    }
}
