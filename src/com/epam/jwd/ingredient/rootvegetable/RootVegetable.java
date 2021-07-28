package com.epam.jwd.ingredient.rootvegetable;

public class RootVegetable {
    protected static final String TYPE = "Root Vegetable";

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
