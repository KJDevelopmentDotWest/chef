package com.epam.jwd.ingredient.tubervegetable;

public class TuberVegetable {
    protected static final String TYPE = "Tuber Vegetable";

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
