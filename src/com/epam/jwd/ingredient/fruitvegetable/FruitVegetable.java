package com.epam.jwd.ingredient.fruitvegetable;

public class FruitVegetable {
    protected static final String TYPE = "Fruit Vegetable";

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
