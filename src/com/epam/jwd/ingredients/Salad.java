package com.epam.jwd.ingredients;


import com.epam.jwd.ingredients.bulbvegetables.BulbVegetable;
import com.epam.jwd.ingredients.fruitvegetables.FruitVegetable;
import com.epam.jwd.ingredients.rootvegetables.RootVegetable;
import com.epam.jwd.ingredients.tubervegetables.TuberVegetable;

import java.util.ArrayList;
import java.util.Arrays;

public class Salad {
    private final ArrayList<Vegetable> salad = new ArrayList<>();

    public void sortByCalories(){
        ArrayList<Vegetable> temp = new ArrayList<>();
        double[] calories = new double[getLength()];
        for (int i = 0; i < salad.size(); i++){
            calories[i] = salad.get(i).getCalorieContent();
        }
        Arrays.sort(calories);
        for (int i = 0; i < salad.size(); i++){
            for (Vegetable var : salad){
                if (var.getCalorieContent() == calories[i]){
                    temp.add(var);
                    break;
                }
            }
        }

        salad.clear();
        salad.addAll(temp);
    }

    public void sortByType(){
        ArrayList<Vegetable> temp = new ArrayList<>();
        for (Vegetable var : salad){
            if (var instanceof TuberVegetable){
                temp.add(var);
            }
        }
        
        for (Vegetable var : salad){
            if (var instanceof RootVegetable){
                temp.add(var);
            }
        }

        for (Vegetable var : salad){
            if (var instanceof BulbVegetable){
                temp.add(var);
            }
        }

        for (Vegetable var : salad){
            if (var instanceof FruitVegetable){
                temp.add(var);
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
        for (Vegetable var : salad){
            counter += var.getCalorieContent();
        }
        return counter;
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        for (Vegetable var : salad){
            stringBuilder.append(var.getName()).append("\n");
        }
        return stringBuilder.toString();
    }

    public String toStringWithinRange(int lowerBound, int upperBound){
        StringBuilder stringBuilder = new StringBuilder("");
        for (Vegetable var : salad){
            if (var.getCalorieContent() > lowerBound && var.getCalorieContent() < upperBound) stringBuilder.append(var.getName()).append("\n");
        }
        return stringBuilder.toString();
    }

    public String generateRecipe(){
        StringBuilder stringBuilder = new StringBuilder("");
        for (Vegetable var : salad){
            if (var.isCanBeCooked()){
                stringBuilder.append("cut and boil ").append(var.getName()).append(" for ").append(var.getCookingTime()).append(" minutes").append("\n");
            } else {
                stringBuilder.append("cut ").append(var.getName()).append("\n");
            }
        }
        stringBuilder.append("Then mix everything and add salt").append("\n");
        return stringBuilder.toString();
    }
}
