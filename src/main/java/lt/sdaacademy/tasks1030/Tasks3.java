package lt.sdaacademy.tasks1030;

import java.util.Scanner;

public class Tasks3 {
    public static void main(String args[]) {
        int x;
        int y;

        Scanner vartotojas = new Scanner(System.in);

        System.out.println("Iveskite x reiksme");
        x = vartotojas.nextInt();
        System.out.print("Iveskite y reiksme");
        y = vartotojas.nextInt();


        if (x == 0 && y > 0) {
            System.out.print("Jusu taskas yra ant y asies");
        } else if
        (x == 0 && y < 0) {
            System.out.print("Jusu taskas yra ant y asies");
        } else if
        (x < 0 && y == 0) {
            System.out.print("Jusu taskas yra ant x asies");
        } else if
        (x > 0 && y == 0) {
            System.out.print("Jusu taskas yra ant x asies");
        } else if
        (x > 0 && y > 0) {
            System.out.print("Jusu taskas yra I ketvirtyje");
        } else if
        (x > 0 && y < 0) {
            System.out.print("Jusu taskas yra IV ketvirtyje");
        } else if
        (x < 0 && y > 0) {
            System.out.print("Jusu taskas yra II ketvirtyje");
        } else if
        (x < 0 && y < 0) {
            System.out.print("Jusu taskas yra III ketvirtyje");
        } else if
        (x == 0 && y == 0) {
            System.out.println("Jusu taskas-asiu susikirtimo taskas");

        }
    }

}











