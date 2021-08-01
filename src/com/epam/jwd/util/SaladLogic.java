package com.epam.jwd.util;


import com.epam.jwd.ingredient.bulbvegetable.BulbVegetable;
import com.epam.jwd.ingredient.fruitvegetable.FruitVegetable;
import com.epam.jwd.ingredient.rootvegetable.RootVegetable;
import com.epam.jwd.ingredient.tubervegetable.TuberVegetable;

import java.util.ArrayList;
import java.util.Arrays;

public class SaladLogic {
    private final ArrayList<Vegetable> salad;

    public SaladLogic(){
         salad = new ArrayList<>();
    }

    public void sortByCalories(){
        ArrayList<Vegetable> temp = new ArrayList<>();
        double[] calories = new double[getLength()];

        for (int i = 0; i < salad.size(); i++){
            calories[i] = salad.get(i).getCalorieContent();
        }
        Arrays.sort(calories);

        for (int i = 0; i < salad.size(); i++){
            for (Vegetable vegetable : salad){
                if (vegetable.getCalorieContent() == calories[i]){
                    temp.add(vegetable);
                    break;
                }
            }
        }

        salad.clear();
        salad.addAll(temp);
    }

    public void sortByType(){
        ArrayList<Vegetable> temp = new ArrayList<>();

        for (Vegetable vegetable : salad){
            if (vegetable instanceof TuberVegetable){
                temp.add(vegetable);
            }
        }
        
        for (Vegetable vegetable : salad){
            if (vegetable instanceof RootVegetable){
                temp.add(vegetable);
            }
        }

        for (Vegetable vegetable : salad){
            if (vegetable instanceof BulbVegetable){
                temp.add(vegetable);
            }
        }

        for (Vegetable vegetable : salad){
            if (vegetable instanceof FruitVegetable){
                temp.add(vegetable);
            }
        }

        salad.clear();
        salad.addAll(temp);
    }

    public void add(Vegetable vegetable){
        salad.add(vegetable);
    }

    public void clear(){
        salad.clear();
    }

    public int getLength(){
        return salad.size();
    }

    public double getCaloriesInfo(){
        double counter = 0;
        for (Vegetable vegetable : salad){
            counter += vegetable.getCalorieContent();
        }
        return counter;
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        for (Vegetable vegetable : salad){
            stringBuilder.append(vegetable.getName()).append("\n");
        }
        return stringBuilder.toString();
    }

    public String toStringWithinRange(int lowerBound, int upperBound){
        StringBuilder stringBuilder = new StringBuilder();

        for (Vegetable vegetable : salad){
            if (vegetable.getCalorieContent() > lowerBound && vegetable.getCalorieContent() < upperBound) stringBuilder.append(vegetable.getName()).append("\n");
        }

        return stringBuilder.toString();
    }

    public String generateRecipe(){
        StringBuilder stringBuilder = new StringBuilder();

        for (Vegetable vegetable : salad){
            if (vegetable.isCanBeCooked()){
                stringBuilder.append("cut and boil ").append(vegetable.getName()).append(" for ").append(vegetable.getCookingTime()).append(" minutes").append("\n");
            } else {
                stringBuilder.append("cut ").append(vegetable.getName()).append("\n");
            }
        }

        stringBuilder.append("Then mix everything and add salt").append("\n");
        return stringBuilder.toString();
    }

    @Override
    public int hashCode() {
        return salad.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ArrayList) return salad.equals(obj);
        else return false;
    }
}
