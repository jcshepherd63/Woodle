package org.jcshepherd;

import java.util.*;


public class Woodle {

    private static final int MAX_GUESSES = 5;
    private static final int NO_MATCH = 0;
    private static final int EXACT_MATCH = 1;
    private static final int ANIMAL_CHARACTERISTICS = 3;
    private static Map<String, Animal> ANIMALS = new HashMap<>();
    private String correctAnimal;

    public static void main(String[] args) {
        Woodle woodleApp = new Woodle();
        woodleApp.run();
    }
    public Woodle() {
        //Making a list of animals and their properties
        ANIMALS.put("Mallard", new Animal("Mallard", "bird", "green", "Central flyway"));
        ANIMALS.put("Widgeon", new Animal("Widgeon","bird", "green", "Pacific/Central Flyway"));
        ANIMALS.put("Wood Duck", new Animal("Wood Duck","bird", "green", "Mississippi flyway"));
        ANIMALS.put("Elk", new Animal("Elk", "Mammal", "tan", "Central US"));
        ANIMALS.put("Whitetail Deer", new Animal("Whitetail Deer", "mammal", "tan", "Entire US"));
        ANIMALS.put("Cottonmouth", new Animal("Cottonmouth", "reptile", "brown", "Southern US"));
        ANIMALS.put("Alligator", new Animal("Alligator", "reptile", "green", "Southeast US"));

        //Randomizing the correct answer from the animals list
        Random randomWord = new Random();
        int wordIndex = randomWord.nextInt(ANIMALS.size());
        List<String> animalNames = new ArrayList<>(ANIMALS.keySet());
        correctAnimal = animalNames.get(wordIndex);



    }

    public void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Woodle");
        System.out.print("Are you ready to guess the U.S. wildlife? (Y/N): ");
        String ready = scanner.nextLine();
        System.out.println("");
        System.out.println("The amount of characters in the correct answer is: " + correctAnimal.length());

        if(ready.equals("Y")) {
            int guessNumber = 1;
            boolean winner = false;

            while (guessNumber <= MAX_GUESSES && !winner) {
                System.out.print("Please enter guess " + guessNumber + ": ");
                String guess = scanner.nextLine();
                guess = guess.toLowerCase();

                ++guessNumber;
                winner = guess.equals(correctAnimal.toLowerCase());
                if (!winner) {
                    Animal animal = ANIMALS.get(correctAnimal);
                    if (guessNumber == 2) {
                        System.out.println("");
                        System.out.println("HINT -- The class of the animal is: " + animal.getAnimalClass());
                    } else if (guessNumber == 3) {
                        System.out.println("");
                        System.out.println("HINT -- The color of the animal is: " + animal.getHeadColor());
                    } else if (guessNumber == 4) {
                        System.out.println("");
                        System.out.println("HINT -- The region of the animal is: " + animal.getMainAnimalLocation());
                    }
                }
            }
            if (winner){
                System.out.println("");
                System.out.println("Congratulations, you won! The correct animal was: " + correctAnimal);
            }else {
                System.out.println("");
                System.out.println("Nice try, the correct animal is: " + correctAnimal);
            }
        }else {
            System.out.println("Come back later!");
        }
    }


}