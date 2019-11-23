
package lt.sdaacademy.tasks1030;

import java.util.Scanner;

public class Tasks5 {
    public static void main(String args[]) {

        Scanner vartotojas = new Scanner(System.in);
        String diena;

        System.out.println("Iveskite savaites dienos pavadinima");
        diena = vartotojas.nextLine();
        switch (diena) {
            case "pirmadienis":
                System.out.println("1");
                break;
            case "antradienis":
                System.out.println("2");
                break;
            case "treciadienis":
                System.out.println("3");
                break;
            case "ketvirtadienis":
                System.out.println("4");
                break;
            case "penktadienis":
                System.out.println("5");
                break;
            case "sestadienis":
                System.out.println("6");
                break;
            case "sekmadienis":
                System.out.println("7");
                break;
        }
    }
}