package lt.sdaacademy.tasks1111;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3CarMain {

    public static void main(String[] args) {
        List<Task3Car> carList = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            carList.add(buildCar());
        }
        System.out.println("Naujausio automobilio modelis: " + findNewestCar(carList));
        System.out.println("Vidutinis automobiliu amžius: " + findAverageYearOfCar(carList));
        System.out.println("Brangiausias automobilio modelis: " + findmostExpensiveetsCarestCar(carList));
    }
    private static Task3Car buildCar() {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Įveskite automobilio modeli");
        String model = inputScanner.nextLine();

        System.out.println("Įveskite automobilio variklio galinguma");
        String engine = inputScanner.nextLine();

        System.out.println("Įveskite automobilio amziu");
        int year = inputScanner.nextInt();

        System.out.println("Įveskite automobilio kaina");
        int price = inputScanner.nextInt();

        System.out.println("Įveskite automobilio tipa");
        String type = inputScanner.nextLine();

        return new Task3Car(model, Integer.parseInt( engine), year, price, type);
    }
    private static String findNewestCar(List<Task3Car> carList) {
       /*return carList.stream()
                .max(Comparator.comparingInt(Car::getAge))
                .get()
                .getModel();*/

        String newestCarModel = "";
        int newestCar = carList.get(0).getYear();


        for (Task3Car car : carList) {
            if (newestCar < car.getYear()) {
                newestCar = car.getYear();
                newestCarModel = car.getModel();
            }
        }
        return newestCarModel;
    }

    private static double findAverageYearOfCar(List<Task3Car> carList) {
        double averageYear = 0;

        for (Task3Car car : carList) {
            averageYear += car.getYear();
        }
        return averageYear / carList.size();
    }

    private static String findmostExpensiveetsCarestCar(List<Task3Car> carList) {

        String expensiveetsCarModel = "";
        int expensiveetsCar = carList.get(0).getPrice();

        String newestsCarModel;
        for (Task3Car car : carList) {
            if (expensiveetsCar < car.getPrice()) {
                expensiveetsCar = car.getPrice();
                expensiveetsCarModel = car.getModel();
            }
        }
        return expensiveetsCarModel;
    }
}


/*String[]model={"Honda","Tojota","BMW"};
        int[]engine={71,93,105,}
        int[]year={2,1,3};
        int[]price={19000,23000,35000};
        String[]type={hegbeg,touring,sedan};*/