package com.epam.jwd.ingredient.bulbvegetable;

import com.epam.jwd.ingredient.Vegetable;

public class Garlic extends BulbVegetable implements Vegetable {
    private static final String NAME = "Garlic";
    private static final int CALORIE_CONTENT = 2;
    private static final int COOKING_TIME = 0;
    private static final boolean CAN_BE_COOKED = false;

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
        if (obj instanceof BulbVegetable) return NAME.equals(((BulbVegetable) obj).getName());
        else return false;
    }

    @Override
    public int hashCode() {
        return NAME.hashCode();
    }
}
