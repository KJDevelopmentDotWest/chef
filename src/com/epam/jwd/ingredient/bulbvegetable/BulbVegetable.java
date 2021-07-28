package com.epam.jwd.ingredient.bulbvegetable;

public class BulbVegetable {
    protected static final String TYPE = "Bulb Vegetable";

    public String getName(){
        return null;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }

    @Override
    public int hashCode(){
        return TYPE.hashCode();
    }
}
