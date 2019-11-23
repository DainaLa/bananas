package lt.sdaacademy.fundamentalscoding.practicalexercisestogether.Foctirial;

import java.util.Scanner;

public class Factorial {

public static void main (String[] args) {
int faktorialas =1;

    Scanner vartotojas = new Scanner(System.in);

    System.out.println("iveskite sveika skaiciu");
    int tarpinis=vartotojas.nextInt();

    for (int i=1; i<=tarpinis; i++) {
        faktorialas=faktorialas*i;
        System.out.println("Faktorialo: " + tarpinis + "rezultatas: " + faktorialas) ;
    }


}
}