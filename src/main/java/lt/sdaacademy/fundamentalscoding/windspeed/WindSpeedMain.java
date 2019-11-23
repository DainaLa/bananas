package lt.sdaacademy.fundamentalscoding.windspeed;


import java.util.Scanner;
public class WindSpeedMain {
    // Same as defining Global variable in AHK
    private static final double NAUTIC_MILE = 1.852;
    private static final double BEAUFORT_CONSTANT = 3.01;

    public static void main(String[] args) {

        Scanner numberScanner = new Scanner(System.in);

        System.out.print("Ivesk vejo greiti km/h: ");
        int windspeed = numberScanner.nextInt();

        System.out.printf("Vejo greitis mazgais:: ", KilometersPerHourToKnots(windspeed));
        System.out.printf("Vejo greitis Beuforto skale:: ", KilometersPerHourToBeaufortScale(windspeed));
        System.out.printf("Vejo stiprumas:: " + getWindStrength(windspeed));
        System.out.println();


        System.out.println("Vejo stiprumas: " + getWindStrength(windspeed));
    }
    private static double KilometersPerHourToKnots(int windspeed){
        return (NAUTIC_MILE*windspeed);

    }
    private static double KilometersPerHourToBeaufortScale(int windspeed){
        double fort = Math.pow(BEAUFORT_CONSTANT, 1.5);
        return windspeed / fort;
    }
    private static String getWindStrength(int windspeed){
        return windspeed <= 20 ? "ramus" : "stiprus";
    }
}





