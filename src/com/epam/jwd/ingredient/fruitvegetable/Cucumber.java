package com.epam.jwd.ingredient.fruitvegetable;

import com.epam.jwd.util.Vegetable;

public class Cucumber extends FruitVegetable implements Vegetable {

    private static final String NAME = "Cucumber";
    private static final int CALORIE_CONTENT = 5;
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
        if (obj instanceof FruitVegetable) return NAME.equals(((FruitVegetable) obj).getName());
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
