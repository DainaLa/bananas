package lt.sdaacademy.tasksDogMainRefactored.refactored;

import lt.sdaacademy.tasksDogMainRefactored.Dog;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class DogMainRefactored {
    private static final String FILE_LOCATION = "C:/Users/DELL/IdeaProjects/Pagrindinis/src/lt/sdaacademy/tasksDogMainRefactored/refactored/DogsData";

    public static void main(String[] args) {

        System.out.println("Vyriausio šuns vardas: " + findOldestDog(getDogsFromFile()));
        System.out.println("Vidutinis šunų amžius: " + findAverageYearOfDogs(getDogsFromFile()));
    }

    private static List<Dog> getDogsFromFile() {
        List<Dog> dogList = new ArrayList<Dog>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_LOCATION))) {
            String line;

            while (true) {
                line =br.readLine();
                if(line == null){
                    break;
                }
                dogList.add(mapDataToObject(line.split(",")));
            }
        } catch (IOException e) {
            System.out.println("KLAIDA!");
        }
        return dogList;
    }

    private static Dog mapDataToObject (String[] dogsData){
        return new Dog(dogsData[0], Integer.parseInt(dogsData[1]), dogsData[2]);
    }
    private static String findOldestDog (List < Dog > dogList) {
        String oldestDogName = "";
        int oldestDog = dogList.get(0).getAge();

        for (Dog dog : dogList) {
            if (oldestDog < dog.getAge()) {
                oldestDog = dog.getAge();
                oldestDogName = dog.getName();
            }
        }
        return oldestDogName;
    }
    private static double findAverageYearOfDogs (List < Dog > dogList) {
        double averageYear = 0;

        for (Dog dog : dogList) {
            averageYear += dog.getAge();
        }
        return averageYear / dogList.size();
    }
}