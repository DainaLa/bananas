package lt.sdaacademy.fundamentalscoding.practicalexercisestogether.averagecalculculator.worker;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WorkerMain {

    public static void main(String[] args) {
        List<Worker> workers = readDataFromFile();

        System.out.println("Vid darbo uzmokestis: " + averageSalary(workers));
        System.out.println("Vid. darbuotoju amzius: " + averageAge(workers));
        System.out.println("Daugiausiai uzdirbantis darbuotojas: " + biggestSal(workers));
        System.out.println("Jauniausias darbuotojas: " + youngestWorker(workers));
    }

    private static List<Worker> readDataFromFile() {
        List<Worker> workers = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("/Users/Daina/IdeaProjects/SDA/SdaAcademy/src/main/java/lt/sdacademy/fundamentalscoding/practicalexercisestogether/workers/WorkersData.txt"))) {
            String line = br.readLine();

            while (line != null) {
                workers.add(mapWorkerData(line));
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Klaida nuskaitant faila!");
        }
        return workers;
    }
    private static Worker mapWorkerData(String line) {
        String[] splittedLine = line.split(",");
        return new Worker(splittedLine[0], Double.parseDouble(splittedLine[1]), Integer.parseInt(splittedLine[2]), splittedLine[3].toCharArray()[0]);
    }
    private static int youngestWorker(List<Worker> workers) {
        int youngestWorker = workers.get(0).getAge();

        for (Worker w : workers) {
            youngestWorker = Math.min(w.getAge(), youngestWorker);
        }
        return youngestWorker;
    }
    private static double biggestSal(List<Worker> workers) {
        double biggestSalary = workers.get(0).getSalary();

        for (Worker w : workers) {
            biggestSalary = Math.max(w.getSalary(), biggestSalary);
        }
        return biggestSalary;
    }
    private static double averageAge(List<Worker> workers) {
        int totalAge = 0;

        for (Worker w : workers) {
            totalAge += w.getAge();
        }
        return (double) totalAge / workers.size();
    }
    private static double averageSalary(List<Worker> workers) {
        int allSall = 0;

        for (Worker w : workers) {
            allSall += w.getAge();
        }
        return (double) allSall / workers.size();
    }
}
