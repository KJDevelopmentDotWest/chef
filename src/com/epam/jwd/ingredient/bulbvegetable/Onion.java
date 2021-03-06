package com.epam.jwd.ingredient.bulbvegetable;

import com.epam.jwd.util.Vegetable;

public class Onion extends BulbVegetable implements Vegetable {

    private static final String NAME = "Onion";
    private static final int CALORIE_CONTENT = 3;
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
        return "Onion";
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


    @Override
    public String toString(){
        return NAME;
    }
}
