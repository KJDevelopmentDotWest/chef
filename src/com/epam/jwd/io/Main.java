package com.epam.jwd.io;

import com.epam.jwd.ingredients.*;
import com.epam.jwd.ingredients.bulbvegetables.Garlic;
import com.epam.jwd.ingredients.bulbvegetables.Onion;
import com.epam.jwd.ingredients.fruitvegetables.Cucumber;
import com.epam.jwd.ingredients.fruitvegetables.Eggplant;
import com.epam.jwd.ingredients.fruitvegetables.Tomato;
import com.epam.jwd.ingredients.rootvegetables.Beet;
import com.epam.jwd.ingredients.rootvegetables.Carrot;
import com.epam.jwd.ingredients.tubervegetables.Artichoke;
import com.epam.jwd.ingredients.tubervegetables.Potato;

import java.util.Scanner;

public class Main {
    private static final Salad salad = new Salad();

    public static void main(String[] args) {
        start();
    }

    static void start(){
        salad.clear();
        System.out.println("Create your own salad");
        createLoop();
    }

    static void createLoop(){
        System.out.println("Add ingredient");
        System.out.println("1 - add Potato");
        System.out.println("2 - add Artichoke");
        System.out.println("3 - add Carrot");
        System.out.println("4 - add Beet");
        System.out.println("5 - add Onion");
        System.out.println("6 - add Garlic");
        System.out.println("7 - add Tomato");
        System.out.println("8 - add Cucumber");
        System.out.println("9 - add Eggplant");
        System.out.println("0 - finish creation");

        int input;
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextInt();

        switch (input){
            case 1:{
                salad.add(new Potato());
                createLoop();
                break;
            }
            case 2:{
                salad.add(new Artichoke());
                createLoop();
                break;
            }
            case 3:{
                salad.add(new Carrot());
                createLoop();
                break;
            }
            case 4:{
                salad.add(new Beet());
                createLoop();
                break;
            }
            case 5:{
                salad.add(new Onion());
                createLoop();
                break;
            }
            case 6:{
                salad.add(new Garlic());
                createLoop();
                break;
            }
            case 7:{
                salad.add(new Tomato());
                createLoop();
                break;
            }
            case 8:{
                salad.add(new Cucumber());
                createLoop();
                break;
            }
            case 9:{
                salad.add(new Eggplant());
                createLoop();
                break;
            }
            case 0:
            default:{
                System.out.println("congrats you created salad");
                processSalad();
                break;
            }
        }
    }

    static void processSalad(){
        System.out.println("Your salad contains:");

        System.out.println(salad.toString());

        System.out.println("1 - Calculate calories");
        System.out.println("2 - Sort ingredients");
        System.out.println("3 - Show ingredients within calories content range");
        System.out.println("4 - Generate recipe");
        System.out.println("5 - Create new salad");

        int input;
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextInt();

        switch (input){
            case 1:{
                System.out.println("Salad's calories content is " + salad.getCaloriesInfo());
                processSalad();
                break;
            }
            case 2:{
                sortSaladDialog();
                break;
            }
            case 3:{
                showWithinRange();
                break;
            }
            case 4:{
                generateRecipe();
                break;
            }
            case 5:{
                start();
                break;
            }
            default:{
                processSalad();
            }
        }
    }

    static void generateRecipe(){
        System.out.println(salad.generateRecipe());
    }

    static void sortSaladDialog(){
        System.out.println("Sorting salad");
        System.out.println("1 - sort by calories content");
        System.out.println("2 - sort by vegetable type");
        System.out.println("3 - return");

        int input;
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextInt();

        switch (input){
            case 1:{
                salad.sortByCalories();
                System.out.println(salad.toString());
                processSalad();
                break;
            }
            case 2:{
                salad.sortByType();
                System.out.println(salad.toString());
                processSalad();
                break;
            }
            case 3:
            default:{
                processSalad();
            }
        }
    }

    static void showWithinRange(){
        int lowerBound;
        int upperBound;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter lower bound");
        lowerBound = scanner.nextInt();
        System.out.println("Enter upper bound");
        upperBound = scanner.nextInt();
        System.out.println(salad.toStringWithinRange(lowerBound, upperBound));
    }
}
