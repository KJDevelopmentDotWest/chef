package com.epam.jwd.ingredient.tubervegetable;

import com.epam.jwd.util.Vegetable;

public class Potato extends TuberVegetable implements Vegetable {

    private static final String NAME = "Potato";
    private static final int CALORIE_CONTENT = 5;
    private static final int COOKING_TIME = 60;
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
        if (obj instanceof TuberVegetable) return NAME.equals(((TuberVegetable) obj).getName());
        else return false;
    }

    @Override
    public int hashCode() {
        return NAME.hashCode();
    }
}
