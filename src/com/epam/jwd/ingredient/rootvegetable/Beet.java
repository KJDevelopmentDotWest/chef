package com.epam.jwd.ingredient.rootvegetable;

import com.epam.jwd.util.Vegetable;

public class Beet extends RootVegetable implements Vegetable {

    private static final String NAME = "Carrot";
    private static final int CALORIE_CONTENT = 11;
    private static final int COOKING_TIME = 120;
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
        return "Beet";
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
